@org.testng.annotations.Test(description = "Try update application by anonymous or different user", expectedExceptions = org.wso2.carbon.apimgt.core.exception.APIMgtResourceNotFoundException.class)
public void testUpdateApplicationAnonymousUser() throws org.wso2.carbon.apimgt.core.exception.APIManagementException {
    org.wso2.carbon.apimgt.core.dao.ApplicationDAO applicationDAO = org.powermock.api.mockito.PowerMockito.mock(org.wso2.carbon.apimgt.core.dao.ApplicationDAO.class);
    org.wso2.carbon.apimgt.core.api.APIStore apiStore = new org.wso2.carbon.apimgt.core.impl.UserAwareAPIStore(org.wso2.carbon.apimgt.core.impl.UserAwareAPIStoreTestCase.USER_NAME, null, applicationDAO, null, null, null, null);
    org.wso2.carbon.apimgt.core.models.Application applicationFromDAO = new org.wso2.carbon.apimgt.core.models.Application(org.wso2.carbon.apimgt.core.impl.UserAwareAPIStoreTestCase.APP_NAME, null);
    applicationFromDAO.setCreatedUser(org.wso2.carbon.apimgt.core.impl.UserAwareAPIStoreTestCase.ANONYMOUS_USER);
    org.wso2.carbon.apimgt.core.models.Application newApplication = new org.wso2.carbon.apimgt.core.models.Application("NEW_APP", null);
    org.mockito.Mockito.when(applicationDAO.getApplication(org.wso2.carbon.apimgt.core.impl.UserAwareAPIStoreTestCase.UUID)).thenReturn(applicationFromDAO);
    apiStore.updateApplication(org.wso2.carbon.apimgt.core.impl.UserAwareAPIStoreTestCase.UUID, newApplication);
}