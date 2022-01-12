public static java.lang.Boolean isTokenValid(com.zoho.oauth.OAuthParams params) {
    if (params != null) {
        if ((params.getAccessToken()) != null) {
            if (((params.getExpiryTime()) - (java.lang.System.currentTimeMillis())) < 60000L) {
                return java.lang.Boolean.FALSE;
            }
        }
    }
    return java.lang.Boolean.TRUE;
}