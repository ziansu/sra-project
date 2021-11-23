public static java.util.Map<java.lang.String, org.wso2.carbon.apimgt.api.model.Tier> getTiers(int tenantId) throws org.wso2.carbon.apimgt.api.APIManagementException {
    try {
        org.wso2.carbon.registry.core.Registry registry = org.wso2.carbon.apimgt.impl.internal.ServiceReferenceHolder.getInstance().getRegistryService().getGovernanceSystemRegistry(tenantId);
        return org.wso2.carbon.apimgt.impl.utils.APIUtil.getTiers(registry, APIConstants.API_TIER_LOCATION);
    } catch (org.wso2.carbon.registry.core.exceptions.RegistryException e) {
        org.wso2.carbon.apimgt.impl.utils.APIUtil.log.error(APIConstants.MSG_TIER_RET_ERROR, e);
        throw new org.wso2.carbon.apimgt.api.APIManagementException(org.wso2.carbon.apimgt.impl.APIConstants.MSG_TIER_RET_ERROR, e);
    }
}