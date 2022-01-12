public boolean isNotFound() {
    org.apache.http.impl.client.CloseableHttpClient httpclient = org.apache.http.impl.client.HttpClients.createDefault();
    org.apache.http.client.methods.HttpGet httpGet = new org.apache.http.client.methods.HttpGet(img_url);
    try {
        org.apache.http.client.methods.CloseableHttpResponse response = httpclient.execute(httpGet);
        int code = response.getStatusLine().getStatusCode();
        java.lang.System.out.println(code);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return false;
    }
    return true;
}