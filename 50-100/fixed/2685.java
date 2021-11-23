public java.lang.String getUrl() throws java.io.IOException {
    if (Config.enableRESTfulSupport) {
        this.replaceRegexForRESTUri();
    }
    java.lang.String url = this.url;
    if ((method.equalsIgnoreCase(HttpMethod.HTTP_GET)) || (method.equalsIgnoreCase(HttpMethod.HTTP_DELETE))) {
        org.gemini.httpengine.library.FormUrlEncodedParser parser = new org.gemini.httpengine.library.FormUrlEncodedParser();
        byte[] data = parser.parse(httpParameters);
        if (null != data) {
            url += "?" + (new java.lang.String(data));
        }
    }
    return url;
}