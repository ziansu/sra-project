@java.lang.Override
public java.util.List<org.wso2.carbon.apimgt.core.models.Subscription> getAPISubscriptionsByApplication(org.wso2.carbon.apimgt.core.models.Application application) throws org.wso2.carbon.apimgt.core.exception.APIManagementException {
    java.util.List<org.wso2.carbon.apimgt.core.models.Subscription> subscriptionsList = null;
    try {
        subscriptionsList = getApiSubscriptionDAO().getAPISubscriptionsByApplication(application.getId());
    } catch (org.wso2.carbon.apimgt.core.exception.APIMgtDAOException e) {
        java.lang.String errorMsg = "Error occurred while retrieving subscriptions for application - " + (application.getName());
        org.wso2.carbon.apimgt.core.impl.APIStoreImpl.log.error(errorMsg, e);
        throw new org.wso2.carbon.apimgt.core.exception.APIMgtDAOException(errorMsg, e, org.wso2.carbon.apimgt.core.exception.ExceptionCodes.APIMGT_DAO_EXCEPTION);
    }
    return subscriptionsList;
}