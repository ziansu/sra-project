@java.lang.Override
public void updateApplication(java.lang.String uuid, org.wso2.carbon.apimgt.core.models.Application application) throws org.wso2.carbon.apimgt.core.exception.APIManagementException {
    try {
        application.setId(uuid);
        application.setUpdatedUser(getUsername());
        application.setUpdatedTime(java.time.LocalDateTime.now());
        getApplicationDAO().updateApplication(uuid, application);
    } catch (org.wso2.carbon.apimgt.core.exception.APIMgtDAOException e) {
        java.lang.String errorMsg = "Error occurred while updating the application - " + uuid;
        org.wso2.carbon.apimgt.core.impl.APIStoreImpl.log.error(errorMsg);
        throw new org.wso2.carbon.apimgt.core.exception.APIMgtDAOException(errorMsg, e, org.wso2.carbon.apimgt.core.exception.ExceptionCodes.APIMGT_DAO_EXCEPTION);
    }
}