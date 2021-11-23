@org.testng.annotations.Test(dependsOnMethods = "testTagGet")
public void testTagAddUsers() throws java.lang.Exception {
    java.util.List<java.lang.String> userIds = new java.util.ArrayList<java.lang.String>();
    userIds.add(((me.chanjar.weixin.cp.api.ApiTestModule.WxXmlCpInMemoryConfigStorage) (configStorage)).getUserId());
    wxService.tagAddUsers(tagId, userIds, null);
}