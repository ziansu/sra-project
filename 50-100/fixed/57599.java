@java.lang.Override
public com.cvte.util.http.Response<org.json.JSONArray> parseNetworkResponse(com.cvte.util.http.NetworkResponse response) {
    try {
        java.lang.String jsonString = new java.lang.String(response.data, com.cvte.util.http.HttpHeaderParser.parseCharset(response.headers));
        return com.cvte.util.http.Response.success(new org.json.JSONArray(jsonString), com.cvte.util.http.HttpHeaderParser.parseCacheHeaders(response));
    } catch (java.io.UnsupportedEncodingException e) {
        return com.cvte.util.http.Response.error(new com.cvte.util.http.error.ParseError(e));
    } catch (org.json.JSONException je) {
        return com.cvte.util.http.Response.error(new com.cvte.util.http.error.ParseError(je));
    }
}