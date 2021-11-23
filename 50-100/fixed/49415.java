public org.apache.http.client.methods.CloseableHttpResponse fetchText() {
    org.apache.http.client.methods.CloseableHttpResponse response = null;
    try {
        response = httpclient.execute(httpGet);
        java.lang.System.out.println((((httpGet.getURI()) + " response code : ") + (response.getStatusLine().getStatusCode())));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return response;
}