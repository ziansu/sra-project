private void setDefaultProperties() throws java.io.IOException {
    urlConn.setRequestProperty("Content-Type", "text/html; charset=UTF-8");
    urlConn.setRequestMethod("GET");
    urlConn.setConnectTimeout(10000);
    urlConn.setDoOutput(true);
    urlConn.setDoInput(true);
}