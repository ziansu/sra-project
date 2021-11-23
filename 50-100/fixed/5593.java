public java.lang.String addQueryParam(java.lang.String key, java.lang.String value) throws java.lang.Exception {
    if ((queries.length()) > 0) {
        queries.append("&");
    }
    queries.append(java.lang.String.format("%s=%s", java.net.URLEncoder.encode(key, "UTF-8"), java.net.URLEncoder.encode(value, "UTF-8")));
    return value;
}