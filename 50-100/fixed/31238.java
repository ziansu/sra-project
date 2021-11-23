@org.testng.annotations.AfterClass(alwaysRun = true)
public void destroy() throws java.lang.Exception {
    int deletedUserCount = 0;
    int beforeDeleteUserCount = org.wso2.am.integration.tests.other.APIM641StoreApiTestCase.storeUserSignUpCredentialsDataProvider().length;
    for (int i = 0; i < (org.wso2.am.integration.tests.other.APIM641StoreApiTestCase.storeUserSignUpCredentialsDataProvider().length); i++) {
        userManagementClient.deleteUser(org.wso2.am.integration.tests.other.APIM641StoreApiTestCase.storeUserSignUpCredentialsDataProvider()[i][0].toString());
        deletedUserCount++;
    }
    org.testng.Assert.assertEquals(deletedUserCount, beforeDeleteUserCount, "Error in user Deletion");
}