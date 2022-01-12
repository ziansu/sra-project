public void addQuery(java.lang.String key, java.lang.String value) throws java.io.UnsupportedEncodingException {
    java.lang.String k = java.net.URLEncoder.encode(key, "UTF-8");
    java.lang.String v = java.net.URLEncoder.encode(value, "UTF-8");
    query_ = (((joiner_) + k) + "=") + v;
    joiner_ = "&";
}