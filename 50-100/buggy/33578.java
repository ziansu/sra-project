@java.lang.Override
public java.lang.String addApiSubscription(java.lang.String apiId, java.lang.String applicationId, java.lang.String tier) throws org.wso2.carbon.apimgt.core.exception.APIManagementException {
    java.lang.String subscriptionId = java.util.UUID.randomUUID().toString();
    try {
        getApiSubscriptionDAO().addAPISubscription(subscriptionId, apiId, applicationId, tier, APIMgtConstants.SubscriptionStatus.ACTIVE);
    } catch (org.wso2.carbon.apimgt.core.exception.APIMgtDAOException e) {
        java.lang.String errorMsg = "Error occurred while adding api subscription for api - " + apiId;
        org.wso2.carbon.apimgt.core.impl.APIStoreImpl.log.error(errorMsg);
        throw new org.wso2.carbon.apimgt.core.exception.APIMgtDAOException(errorMsg, e, org.wso2.carbon.apimgt.core.exception.ExceptionCodes.APIMGT_DAO_EXCEPTION);
    }
    return subscriptionId;
}