@java.lang.Override
public java.util.List<org.wso2.carbon.apimgt.core.models.Application> getApplications(java.lang.String subscriber, java.lang.String groupId) throws org.wso2.carbon.apimgt.core.exception.APIManagementException {
    java.util.List<org.wso2.carbon.apimgt.core.models.Application> applicationList = null;
    try {
        applicationList = getApplicationDAO().getApplications(subscriber);
    } catch (org.wso2.carbon.apimgt.core.exception.APIMgtDAOException e) {
        java.lang.String errorMsg = (("Error occurred while fetching applications for the given subscriber - " + subscriber) + " with groupId - ") + groupId;
        org.wso2.carbon.apimgt.core.impl.APIStoreImpl.log.error(errorMsg, e);
        throw new org.wso2.carbon.apimgt.core.exception.APIMgtDAOException(errorMsg, e, org.wso2.carbon.apimgt.core.exception.ExceptionCodes.APIMGT_DAO_EXCEPTION);
    }
    return applicationList;
}