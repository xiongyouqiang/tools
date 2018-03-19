package com.xyq.tools.test;

import com.trendy.ec.admin.client.AdminServiceClient;

/****
 * 工具类测试
* @ClassName: Test 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author youqiang.xiong
* @date 2018年3月19日 上午10:44:53 
*
 */
public class Test {

	
	@org.junit.Test
	public void testAdminClient()
	{
		AdminServiceClient client = new AdminServiceClient();
		System.out.println(client.getAdminUserInfoAllList());;
	}

}
