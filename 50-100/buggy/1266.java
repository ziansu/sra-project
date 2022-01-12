@java.lang.Override
protected com.cvte.util.http.Response<java.lang.String> parseNetworkResponse(com.cvte.util.http.NetworkResponse response) {
    java.lang.String parsed;
    try {
        parsed = new java.lang.String(response.data, com.cvte.util.http.HttpHeaderParser.parseCharset(response.headers));
    } catch (java.io.UnsupportedEncodingException e) {
        parsed = new java.lang.String(response.data);
    }
    return com.cvte.util.http.Response.success(parsed, com.cvte.util.http.HttpHeaderParser.parseCacheHeaders(response));
}