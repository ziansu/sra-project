@org.testng.annotations.Test(description = "Try update null application", expectedExceptions = org.wso2.carbon.apimgt.core.exception.APIMgtResourceNotFoundException.class)
public void testUpdateApplicationNull() throws org.wso2.carbon.apimgt.core.exception.APIManagementException {
    org.wso2.carbon.apimgt.core.dao.ApplicationDAO applicationDAO = org.powermock.api.mockito.PowerMockito.mock(org.wso2.carbon.apimgt.core.dao.ApplicationDAO.class);
    org.wso2.carbon.apimgt.core.api.APIStore apiStore = new org.wso2.carbon.apimgt.core.impl.UserAwareAPIStore(org.wso2.carbon.apimgt.core.impl.UserAwareAPIStoreTestCase.USER_NAME, null, applicationDAO, null, null, null, null);
    apiStore.updateApplication(org.wso2.carbon.apimgt.core.impl.UserAwareAPIStoreTestCase.UUID, null);
}