public static java.util.List<java.lang.String> getCacheDisabledAuthenticators() {
    if (org.apache.commons.collections.CollectionUtils.isEmpty(org.wso2.carbon.identity.application.authentication.framework.util.FrameworkUtils.cacheDisabledAuthenticators)) {
        org.wso2.carbon.identity.application.authentication.framework.util.FrameworkUtils.cacheDisabledAuthenticators.add(FrameworkConstants.RequestType.CLAIM_TYPE_SAML_SSO);
        org.wso2.carbon.identity.application.authentication.framework.util.FrameworkUtils.cacheDisabledAuthenticators.add(FrameworkConstants.OAUTH2);
    }
    return org.wso2.carbon.identity.application.authentication.framework.util.FrameworkUtils.cacheDisabledAuthenticators;
}