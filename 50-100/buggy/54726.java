private boolean renewIfNeccessary() throws net.koofr.api.v2.StorageApiException {
    if (((oauthToken) == null) || ((oauthToken.refresh) == null)) {
        throw new net.koofr.api.v2.StorageApiException(new org.restlet.resource.ResourceException(401));
    }
    if ((((oauthToken.access) != null) && ((oauthToken.token) != null)) && (((oauthToken.expires) - (EXPIRATION_THRESHOLD)) > (new java.util.Date().getTime()))) {
        return false;
    }
    setOAuthRefreshToken(oauthToken.refresh);
    return true;
}