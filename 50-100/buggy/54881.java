java.lang.String generateAuthorizationHeader(java.lang.String method, java.lang.String url, weibo4j.http.PostParameter[] params, weibo4j.http.OAuthToken token) {
    java.util.TimeZone.setDefault(java.util.TimeZone.getTimeZone("GMT+8"));
    long timestamp = (java.lang.System.currentTimeMillis()) / 1000;
    long nonce = timestamp + (weibo4j.http.OAuth.RAND.nextInt());
    return generateAuthorizationHeader(method, url, params, java.lang.String.valueOf(nonce), java.lang.String.valueOf(timestamp), token);
}