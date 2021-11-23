protected void preOperation(com.baidu.aip.client.AipRequest request) {
    if (needAuth()) {
        getAccessToken(config);
    }
    request.setHttpMethod(HttpMethodName.POST);
    request.addHeader(Headers.CONTENT_TYPE, HttpContentType.FORM_URLENCODE_DATA);
    request.addHeader("accept", "*/*");
    request.setConfig(config);
}