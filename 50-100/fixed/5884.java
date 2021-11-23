@java.lang.Override
public org.wso2.carbon.apimgt.core.models.Application getApplicationByName(java.lang.String applicationName, java.lang.String ownerId, java.lang.String groupId) throws org.wso2.carbon.apimgt.core.exception.APIManagementException {
    org.wso2.carbon.apimgt.core.models.Application application = null;
    try {
        application = getApplicationDAO().getApplicationByName(applicationName, ownerId);
    } catch (org.wso2.carbon.apimgt.core.exception.APIMgtDAOException e) {
        java.lang.String errorMsg = (("Error occurred while fetching application for the given applicationName - " + applicationName) + " with groupId - ") + groupId;
        org.wso2.carbon.apimgt.core.impl.APIStoreImpl.log.error(errorMsg, e);
        throw new org.wso2.carbon.apimgt.core.exception.APIMgtDAOException(errorMsg, e, org.wso2.carbon.apimgt.core.exception.ExceptionCodes.APIMGT_DAO_EXCEPTION);
    }
    return application;
}