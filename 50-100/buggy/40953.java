private java.lang.String authBackUrl(java.lang.String backUrl, java.lang.String token) {
    java.lang.StringBuilder sbf = new java.lang.StringBuilder(backUrl);
    if ((backUrl.indexOf("?")) > 0) {
        sbf.append("&");
    }else {
        sbf.append("?");
    }
    sbf.append(SsoFilter.SSO_TOKEN_NAME).append("=").append(token);
    return sbf.toString();
}