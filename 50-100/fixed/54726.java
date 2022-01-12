private boolean renewIfNeccessary() throws org.restlet.resource.ResourceException {
    if (((oauthToken) == null) || ((oauthToken.refresh) == null)) {
        throw new org.restlet.resource.ResourceException(401);
    }
    if ((((oauthToken.access) != null) && ((oauthToken.token) != null)) && (((oauthToken.expires) - (EXPIRATION_THRESHOLD)) > (new java.util.Date().getTime()))) {
        return false;
    }
    setOAuthRefreshToken(oauthToken.refresh);
    return true;
}