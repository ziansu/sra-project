public static java.lang.String post(java.lang.String url, java.lang.String parameters, java.util.Map<java.lang.String, java.lang.String> customeHeaders, java.lang.String charset) throws java.io.IOException {
    try {
        okhttp3.Response response = so.asch.sdk.impl.RESTOkHttp.rawPost(url, parameters, customeHeaders, charset);
        return so.asch.sdk.impl.RESTOkHttp.getResponseContent(response);
    } catch (java.io.IOException ex) {
        java.lang.String errorInfo = java.lang.String.format("Exception when post,url:%s,data:%s", url, parameters);
        ex.printStackTrace();
        throw ex;
    }
}