public java.lang.String getResult(java.lang.String code) {
    com.github.scribejava.core.model.OAuth2AccessToken accessToken = null;
    try {
        accessToken = getOAuthService().getAccessToken(code);
    } catch (java.io.IOException e) {
    } finally {
    }
    java.lang.String accessTokenStr = accessToken.getRawResponse();
    return accessTokenStr;
}