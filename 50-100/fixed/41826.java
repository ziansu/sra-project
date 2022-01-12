@java.lang.Override
public void deleteAPISubscription(java.lang.String subscriptionId) throws org.wso2.carbon.apimgt.core.exception.APIMgtDAOException {
    try {
        getApiSubscriptionDAO().deleteAPISubscription(subscriptionId);
    } catch (org.wso2.carbon.apimgt.core.exception.APIMgtDAOException e) {
        java.lang.String errorMsg = "Error occurred while deleting api subscription - " + subscriptionId;
        org.wso2.carbon.apimgt.core.impl.APIStoreImpl.log.error(errorMsg);
        throw new org.wso2.carbon.apimgt.core.exception.APIMgtDAOException(errorMsg, e, org.wso2.carbon.apimgt.core.exception.ExceptionCodes.APIMGT_DAO_EXCEPTION);
    }
}