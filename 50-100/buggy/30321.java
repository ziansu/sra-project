@org.testng.annotations.Test(description = "Exception when retrieving an application by uuid", expectedExceptions = org.wso2.carbon.apimgt.core.exception.APIMgtDAOException.class)
public void testGetApplicationByUuidException() throws org.wso2.carbon.apimgt.core.exception.APIManagementException {
    org.wso2.carbon.apimgt.core.dao.ApplicationDAO applicationDAO = org.mockito.Mockito.mock(org.wso2.carbon.apimgt.core.dao.ApplicationDAO.class);
    org.wso2.carbon.apimgt.core.impl.AbstractAPIManager apiStore = new org.wso2.carbon.apimgt.core.impl.APIStoreImpl(org.wso2.carbon.apimgt.core.impl.AbstractAPIManagerTestCase.USER_NAME, null, applicationDAO, null, null, null, null);
    org.mockito.Mockito.doThrow(new org.wso2.carbon.apimgt.core.exception.APIMgtDAOException("Error occurred while retrieving application")).when(applicationDAO).getApplication(org.wso2.carbon.apimgt.core.impl.AbstractAPIManagerTestCase.UUID);
    apiStore.getApplication(org.wso2.carbon.apimgt.core.impl.AbstractAPIManagerTestCase.UUID, org.wso2.carbon.apimgt.core.impl.AbstractAPIManagerTestCase.USER_NAME, null);
}