@java.lang.Override
public java.util.List<org.wso2.carbon.apimgt.core.models.API> getAllAPIsByStatus(int offset, int limit, java.lang.String[] statuses) throws org.wso2.carbon.apimgt.core.exception.APIManagementException {
    java.util.List<org.wso2.carbon.apimgt.core.models.API> apiResults = null;
    try {
        apiResults = getApiDAO().getAPIsByStatus(new java.util.ArrayList<>(java.util.Arrays.asList(statuses)));
    } catch (org.wso2.carbon.apimgt.core.exception.APIMgtDAOException e) {
        java.lang.String errorMsg = "Error occurred while fetching APIs for the given statuses - " + (java.util.Arrays.toString(statuses));
        org.wso2.carbon.apimgt.core.impl.APIStoreImpl.log.error(errorMsg);
        throw new org.wso2.carbon.apimgt.core.exception.APIMgtDAOException(errorMsg, e, org.wso2.carbon.apimgt.core.exception.ExceptionCodes.APIMGT_DAO_EXCEPTION);
    }
    return apiResults;
}