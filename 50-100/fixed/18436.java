public static java.lang.String prependTenantPrefix(java.lang.String postfixUrl, java.lang.String username) {
    java.lang.String tenantDomain = org.wso2.carbon.utils.multitenancy.MultitenantUtils.getTenantDomain(org.wso2.carbon.apimgt.impl.utils.APIUtil.replaceEmailDomainBack(username));
    if (!(MultitenantConstants.SUPER_TENANT_DOMAIN_NAME.equals(tenantDomain))) {
        java.lang.String tenantPrefix = "/t/";
        postfixUrl = (tenantPrefix + tenantDomain) + postfixUrl;
    }
    return postfixUrl;
}