@java.lang.Override
protected com.android.volley.Response<T> parseNetworkResponse(com.android.volley.NetworkResponse response) {
    try {
        java.lang.String jsonString = new java.lang.String(response.data, com.android.volley.toolbox.HttpHeaderParser.parseCharset(response.headers));
        android.util.Log.d("TAG-------", jsonString);
        return com.android.volley.Response.success(mGson.fromJson(jsonString, mClass), com.android.volley.toolbox.HttpHeaderParser.parseCacheHeaders(response));
    } catch (java.io.UnsupportedEncodingException e) {
        return com.android.volley.Response.error(new com.android.volley.ParseError(e));
    }
}