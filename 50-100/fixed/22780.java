public static java.util.Map<java.lang.String, java.lang.String> GetHMACHeaders(int userId, java.lang.String body, java.lang.String key) {
    java.lang.String secret;
    java.util.Map<java.lang.String, java.lang.String> result = new java.util.HashMap<java.lang.String, java.lang.String>();
    try {
        secret = java.net.URLEncoder.encode(com.sbacs.phoneapp.HMAC.HMACHelper.SecretString(body, key), "UTF-16");
    } catch (java.io.UnsupportedEncodingException e) {
        secret = "";
    }
    result.put("hmac-user", ("" + userId));
    result.put("hmac-content", secret);
    return result;
}