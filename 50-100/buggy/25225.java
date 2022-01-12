@org.testng.annotations.Test(dataProvider = "GroupsInCommon")
public void testGroupsInCommon(java.util.Set<java.lang.String> fetcherSGs, java.util.List<java.lang.String> tokenSGs) throws java.lang.Throwable {
    org.mockito.Mockito.doReturn(fetcherSGs).when(fetcher).fetchSecurityGroups(authorizationObject);
    token = com.vmware.photon.controller.api.frontend.auth.AuthTestHelper.generateResourceServerAccessToken(fetcherSGs);
    policyProvider.checkAccessPermissions(request, token);
}