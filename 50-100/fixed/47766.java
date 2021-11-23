public static boolean isRedirectionUriValid(java.lang.String redirectUri) {
    if (org.wso2.carbon.identity.oauth.dcr.util.DCRMUtils.log.isDebugEnabled()) {
        org.wso2.carbon.identity.oauth.dcr.util.DCRMUtils.log.debug(("Validating uri: " + redirectUri));
    }
    if (org.wso2.carbon.identity.core.util.IdentityUtil.isBlank(redirectUri)) {
        org.wso2.carbon.identity.oauth.dcr.util.DCRMUtils.log.error("The redirection URI is either null or blank.");
        return false;
    }
    try {
        new java.net.URI(redirectUri);
    } catch (java.net.URISyntaxException e) {
        java.lang.String errorMessage = ("The redirection URI: " + redirectUri) + ", is not a valid URI.";
        org.wso2.carbon.identity.oauth.dcr.util.DCRMUtils.log.error(errorMessage, e);
        return false;
    }
    return true;
}