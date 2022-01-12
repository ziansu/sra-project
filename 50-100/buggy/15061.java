@java.lang.Override
public java.util.List<org.wso2.carbon.apimgt.core.models.API> searchAPIs(java.lang.String query, int offset, int limit) throws org.wso2.carbon.apimgt.core.exception.APIManagementException {
    java.util.List<org.wso2.carbon.apimgt.core.models.API> apiResults = null;
    try {
        apiResults = getApiDAO().searchAPIs(query);
    } catch (org.wso2.carbon.apimgt.core.exception.APIMgtDAOException e) {
        java.lang.String errorMsg = "Error occurred while updating searching APIs - " + query;
        org.wso2.carbon.apimgt.core.impl.APIStoreImpl.log.error(errorMsg);
        throw new org.wso2.carbon.apimgt.core.exception.APIMgtDAOException(errorMsg, e, org.wso2.carbon.apimgt.core.exception.ExceptionCodes.APIMGT_DAO_EXCEPTION);
    }
    return apiResults;
}