@java.lang.Override
public void run() {
    org.apache.http.client.HttpClient httpClient = clientFactory.getHttpClient();
    preemptivelySetAuthCredentials(httpClient);
    request.addHeader("Content-Type", "application/json");
    request.addHeader("Accept", "multipart/related");
    request.addHeader("User-Agent", Manager.USER_AGENT);
    request.addHeader("X-Accept-Part-Encoding", "gzip");
    request.addHeader("Accept-Encoding", "gzip, deflate");
    addRequestHeaders(request);
    setBody(request);
    executeRequest(httpClient, request);
}