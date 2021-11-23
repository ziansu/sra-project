@java.lang.Override
public void deleteApplication(java.lang.String appId) throws org.wso2.carbon.apimgt.core.exception.APIManagementException {
    try {
        getApplicationDAO().deleteApplication(appId);
    } catch (org.wso2.carbon.apimgt.core.exception.APIMgtDAOException e) {
        java.lang.String errorMsg = "Error occurred while deleting the application - " + appId;
        org.wso2.carbon.apimgt.core.impl.APIStoreImpl.log.error(errorMsg, e);
        throw new org.wso2.carbon.apimgt.core.exception.APIMgtDAOException(errorMsg, e, org.wso2.carbon.apimgt.core.exception.ExceptionCodes.APIMGT_DAO_EXCEPTION);
    }
}