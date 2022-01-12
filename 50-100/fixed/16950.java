@java.lang.Override
public java.util.List<org.wso2.carbon.apimgt.core.models.policy.Policy> getPolicies(java.lang.String policyLevel) throws org.wso2.carbon.apimgt.core.exception.APIManagementException {
    java.util.List<org.wso2.carbon.apimgt.core.models.policy.Policy> policyList = null;
    try {
        policyList = getPolicyDAO().getPolicies(policyLevel);
    } catch (org.wso2.carbon.apimgt.core.exception.APIMgtDAOException e) {
        java.lang.String errorMsg = "Error occurred while retrieving policies for policy level - " + policyLevel;
        org.wso2.carbon.apimgt.core.impl.APIStoreImpl.log.error(errorMsg, e);
        throw new org.wso2.carbon.apimgt.core.exception.APIMgtDAOException(errorMsg, e, org.wso2.carbon.apimgt.core.exception.ExceptionCodes.APIMGT_DAO_EXCEPTION);
    }
    return policyList;
}