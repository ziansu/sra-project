public static java.lang.String getUserConsumerId() {
    java.lang.String userName = org.wso2.carbon.context.PrivilegedCarbonContext.getThreadLocalCarbonContext().getUsername();
    java.lang.String currentTenantDomain = org.wso2.carbon.context.PrivilegedCarbonContext.getThreadLocalCarbonContext().getTenantDomain();
    return org.wso2.carbon.user.core.util.UserCoreUtil.addTenantDomainToEntry(userName, currentTenantDomain);
}