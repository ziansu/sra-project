@org.testng.annotations.Test(description = "Exception when deleting application", expectedExceptions = org.wso2.carbon.apimgt.core.exception.APIMgtDAOException.class)
public void testDeleteApplicationException() throws org.wso2.carbon.apimgt.core.exception.APIManagementException {
    org.wso2.carbon.apimgt.core.dao.ApplicationDAO applicationDAO = org.powermock.api.mockito.PowerMockito.mock(org.wso2.carbon.apimgt.core.dao.ApplicationDAO.class);
    org.wso2.carbon.apimgt.core.api.APIStore apiStore = new org.wso2.carbon.apimgt.core.impl.UserAwareAPIStore(org.wso2.carbon.apimgt.core.impl.UserAwareAPIStoreTestCase.USER_NAME, null, applicationDAO, null, null, null, null, null);
    org.wso2.carbon.apimgt.core.models.Application applicationFromDAO = new org.wso2.carbon.apimgt.core.models.Application(org.wso2.carbon.apimgt.core.impl.UserAwareAPIStoreTestCase.APP_NAME, null);
    applicationFromDAO.setCreatedUser(org.wso2.carbon.apimgt.core.impl.UserAwareAPIStoreTestCase.USER_NAME);
    org.mockito.Mockito.when(applicationDAO.getApplication(org.wso2.carbon.apimgt.core.impl.UserAwareAPIStoreTestCase.UUID)).thenThrow(new org.wso2.carbon.apimgt.core.exception.APIMgtDAOException(("Error occurred while deleting application - " + (org.wso2.carbon.apimgt.core.impl.UserAwareAPIStoreTestCase.UUID))));
    apiStore.deleteApplication(org.wso2.carbon.apimgt.core.impl.UserAwareAPIStoreTestCase.UUID);
}