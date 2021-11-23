@org.testng.annotations.Test(description = "Exception when retrieving documentation summary given the id", expectedExceptions = org.wso2.carbon.apimgt.core.exception.APIMgtDAOException.class)
public void testGetDocumentationSummaryException() throws org.wso2.carbon.apimgt.core.exception.APIManagementException {
    org.wso2.carbon.apimgt.core.dao.ApiDAO apiDAO = org.mockito.Mockito.mock(org.wso2.carbon.apimgt.core.dao.ApiDAO.class);
    org.wso2.carbon.apimgt.core.impl.AbstractAPIManager apiStore = new org.wso2.carbon.apimgt.core.impl.APIStoreImpl(org.wso2.carbon.apimgt.core.impl.AbstractAPIManagerTestCase.USER_NAME, apiDAO, null, null, null, null, null);
    org.mockito.Mockito.when(apiDAO.getDocumentInfo(org.wso2.carbon.apimgt.core.impl.AbstractAPIManagerTestCase.UUID)).thenThrow(new org.wso2.carbon.apimgt.core.exception.APIMgtDAOException("Error occurred while retrieving documents"));
    apiStore.getDocumentationSummary(org.wso2.carbon.apimgt.core.impl.AbstractAPIManagerTestCase.UUID);
}