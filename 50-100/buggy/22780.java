public static com.sbacs.phoneapp.HMAC.Map<java.lang.String, java.lang.String> GetHMACHeaders(int userId, java.lang.String body, java.lang.String key) {
    java.lang.String secret;
    com.sbacs.phoneapp.HMAC.Map<java.lang.String, java.lang.String> result = new com.sbacs.phoneapp.HMAC.HashMap<java.lang.String, java.lang.String>();
    try {
        secret = java.net.URLEncoder.encode(com.sbacs.phoneapp.HMAC.HMACHelper.SecretString(body, key), "UTF-16");
    } catch (java.io.UnsupportedEncodingException e) {
        secret = "";
    }
    result.add("hmac-user", userId.toString());
    result.add("hmac-content", secret);
    return result;
}