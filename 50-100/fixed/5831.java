public java.util.concurrent.Future<com.uniform_imperials.herald.http.AbstractHttpResponse> post(java.lang.String uri, java.util.HashMap<java.lang.String, java.lang.String> args) {
    java.lang.String requestBody;
    if (args != null) {
        requestBody = this.encodeParamString(args);
    }else {
        requestBody = null;
    }
    return this.post(uri, requestBody, "application/x-www-form-urlencoded");
}