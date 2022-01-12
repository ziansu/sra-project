public static java.lang.String prependTenantPrefix(java.lang.String postfixUrl, java.lang.String username) {
    java.lang.String tenantDomain = org.wso2.carbon.utils.multitenancy.MultitenantUtils.getTenantDomain(org.wso2.carbon.apimgt.impl.utils.APIUtil.replaceEmailDomainBack(username));
    if (!(tenantDomain.equals(MultitenantConstants.SUPER_TENANT_DOMAIN_NAME))) {
        java.lang.String tenantPrefix = "/t/";
        if (tenantDomain != null) {
            postfixUrl = (tenantPrefix + tenantDomain) + postfixUrl;
        }
    }
    return postfixUrl;
}