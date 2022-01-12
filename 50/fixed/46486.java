public com.google.api.client.http.HttpHeaders getHeaders() {
    if ((headers) == null) {
        headers = new com.google.api.client.http.HttpHeaders();
        headers.setUserAgent(ru.simpleGBD.App.Utils.HttpConnections.USER_AGENT);
    }
    return headers;
}