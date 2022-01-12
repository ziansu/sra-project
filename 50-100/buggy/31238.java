@org.testng.annotations.AfterClass(alwaysRun = true)
public void destroy() throws java.lang.Exception {
    org.wso2.carbon.automation.engine.context.AutomationContext storeContext = new org.wso2.carbon.automation.engine.context.AutomationContext(org.wso2.am.integration.test.utils.base.APIMIntegrationConstants.AM_PRODUCT_GROUP_NAME, org.wso2.am.integration.test.utils.base.APIMIntegrationConstants.AM_STORE_INSTANCE, org.wso2.carbon.automation.engine.context.TestUserMode.SUPER_TENANT_ADMIN);
    int deletedUserCount = 0;
    int beforeDeleteUserCount = org.wso2.am.integration.tests.other.APIM641StoreApiTestCase.storeUserSignUpCredentialsDataProvider().length;
    for (int i = 0; i < (org.wso2.am.integration.tests.other.APIM641StoreApiTestCase.storeUserSignUpCredentialsDataProvider().length); i++) {
        userManagementClient.deleteUser(org.wso2.am.integration.tests.other.APIM641StoreApiTestCase.storeUserSignUpCredentialsDataProvider()[i][0].toString());
        deletedUserCount++;
    }
    assertEquals(deletedUserCount, beforeDeleteUserCount, "Error in user Deletion");
}