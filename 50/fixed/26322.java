private com.github.kevinsawicki.http.HttpRequest prepareApiPostRequest(java.lang.String apiPath, boolean withToken, java.util.Map<java.lang.String, ?> params) throws com.github.kevinsawicki.http.HttpRequest.HttpRequestException {
    return prepareApiPostRequest(apiPath, withToken, params, false);
}