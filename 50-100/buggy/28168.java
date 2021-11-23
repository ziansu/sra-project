@java.lang.Override
public org.wso2.carbon.apimgt.core.models.policy.Policy getPolicy(java.lang.String policyLevel, java.lang.String policyName) throws org.wso2.carbon.apimgt.core.exception.APIManagementException {
    org.wso2.carbon.apimgt.core.models.policy.Policy policy = null;
    try {
        policy = getPolicyDAO().getPolicy(policyLevel, policyName);
    } catch (org.wso2.carbon.apimgt.core.exception.APIMgtDAOException e) {
        java.lang.String errorMsg = "Error occurred while retrieving policy - " + policyName;
        org.wso2.carbon.apimgt.core.impl.APIStoreImpl.log.error(errorMsg);
        throw new org.wso2.carbon.apimgt.core.exception.APIMgtDAOException(errorMsg, e, org.wso2.carbon.apimgt.core.exception.ExceptionCodes.APIMGT_DAO_EXCEPTION);
    }
    return policy;
}