@java.lang.Override
public org.wso2.carbon.apimgt.core.models.Application getApplicationByUuid(java.lang.String uuid) throws org.wso2.carbon.apimgt.core.exception.APIManagementException {
    org.wso2.carbon.apimgt.core.models.Application application = null;
    try {
        application = getApplicationDAO().getApplication(uuid);
    } catch (org.wso2.carbon.apimgt.core.exception.APIMgtDAOException e) {
        java.lang.String errorMsg = "Error occurred while retrieving application - " + uuid;
        org.wso2.carbon.apimgt.core.impl.APIStoreImpl.log.error(errorMsg);
        throw new org.wso2.carbon.apimgt.core.exception.APIMgtDAOException(errorMsg, e, org.wso2.carbon.apimgt.core.exception.ExceptionCodes.APIMGT_DAO_EXCEPTION);
    }
    return application;
}