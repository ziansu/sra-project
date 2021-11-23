@org.testng.annotations.Test(dataProvider = "testGetAuthenticatedUser")
public void testGetAuthenticatedUser(java.lang.String fullQualifiedName, java.lang.String username) throws java.lang.Exception {
    org.powermock.api.mockito.PowerMockito.mockStatic(org.wso2.carbon.identity.core.util.IdentityUtil.class);
    org.powermock.api.mockito.PowerMockito.when(org.wso2.carbon.identity.core.util.IdentityUtil.extractDomainFromName(org.mockito.Matchers.anyString())).thenCallRealMethod();
    org.powermock.api.mockito.PowerMockito.when(org.wso2.carbon.identity.core.util.IdentityUtil.getPrimaryDomainName()).thenReturn("PRIMARY");
    org.testng.Assert.assertEquals(org.wso2.carbon.identity.oauth.OAuthUtil.getAuthenticatedUser(fullQualifiedName).getUserName(), username, ("Should set the " + "cleared username from fullyQualifiedName."));
}