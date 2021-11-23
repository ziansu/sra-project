public static java.lang.String makeAuthorizeUri(java.lang.String redirectTo) {
    try {
        java.lang.String authorizeRedirectUri = com.xfrocks.api.androiddemo.Api.makeAuthorizeRedirectUri(redirectTo);
        java.lang.String encodedRedirectTo = "";
        if (authorizeRedirectUri != null) {
            java.net.URLEncoder.encode(authorizeRedirectUri, "UTF-8");
        }
        return java.lang.String.format("%s/index.php?oauth/authorize/&client_id=%s&redirect_uri=%s&response_type=code&scope=%s", BuildConfig.API_ROOT, java.net.URLEncoder.encode(BuildConfig.CLIENT_ID, "UTF-8"), encodedRedirectTo, java.net.URLEncoder.encode("read", "UTF-8"));
    } catch (java.io.UnsupportedEncodingException e) {
    }
    return null;
}