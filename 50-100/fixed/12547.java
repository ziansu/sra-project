private java.lang.String percentEncodeRfc3986(java.lang.String s) {
    java.lang.String out;
    try {
        out = java.net.URLEncoder.encode(s, utils.SignedRequestsHelper.UTF8_CHARSET).replace("+", "%20").replace("*", "%2A").replace("%7E", "~");
    } catch (java.io.UnsupportedEncodingException e) {
        out = s;
    }
    return out;
}