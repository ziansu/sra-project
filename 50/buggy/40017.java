private java.lang.String encode(java.lang.String str) throws java.io.UnsupportedEncodingException {
    return java.net.URLEncoder.encode(str, "UTF-8");
}