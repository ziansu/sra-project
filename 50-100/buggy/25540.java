public static void createAppRole(java.lang.String applicationName) throws org.wso2.carbon.identity.application.common.IdentityApplicationManagementException {
    java.lang.String roleName = org.wso2.carbon.user.core.util.UserCoreUtil.addInternalDomainName(applicationName);
    java.lang.String qualifiedUsername = org.wso2.carbon.context.CarbonContext.getThreadLocalCarbonContext().getUsername();
    java.lang.String[] user = new java.lang.String[]{ org.wso2.carbon.utils.multitenancy.MultitenantUtils.getTenantAwareUsername(qualifiedUsername) };
    try {
        org.wso2.carbon.context.CarbonContext.getThreadLocalCarbonContext().getUserRealm().getUserStoreManager().addRole(roleName, user, null);
    } catch (org.wso2.carbon.user.api.UserStoreException e) {
        throw new org.wso2.carbon.identity.application.common.IdentityApplicationManagementException("Error while creating application", e);
    }
}