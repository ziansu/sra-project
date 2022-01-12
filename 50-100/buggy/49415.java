public org.apache.http.client.methods.CloseableHttpResponse fetchText(io.netty.handler.codec.http.HttpMethod method, io.netty.handler.codec.http.HttpHeaders headers) {
    java.lang.String body = "";
    setHeader(httpGet, headers);
    org.apache.http.client.methods.CloseableHttpResponse response = null;
    try {
        response = httpclient.execute(httpHost, httpGet);
        java.lang.System.out.println((((httpGet.getURI()) + " response code : ") + (response.getStatusLine().getStatusCode())));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return response;
}