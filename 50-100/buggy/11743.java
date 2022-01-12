protected com.stormpath.sdk.api.ApiKey getTokenApiKey(javax.servlet.http.HttpServletRequest request, java.lang.String apiKeyId) throws com.stormpath.sdk.servlet.filter.oauth.OAuthException {
    try {
        return getEnabledApiKey(request, apiKeyId);
    } catch (com.stormpath.sdk.resource.ResourceException e) {
        com.stormpath.sdk.servlet.filter.oauth.OAuthErrorCode err = com.stormpath.sdk.servlet.filter.oauth.OAuthErrorCode.INVALID_CLIENT;
        java.lang.String msg = e.getStormpathError().getDeveloperMessage();
        throw new com.stormpath.sdk.servlet.filter.oauth.OAuthException(err, msg, null, e);
    }
}