private void saveRequest(java.lang.String method, java.lang.String bucket, java.util.Map<java.lang.String, java.lang.String> queryParams, java.util.Map<java.lang.String, java.lang.String> headers, java.lang.String body, java.lang.String path) {
    save(new com.losd.reqbot.model.Request(bucket, headers, body, queryParams, method, path));
}