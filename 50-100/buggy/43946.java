private java.net.HttpURLConnection preparePost(java.lang.String content, java.lang.String path) throws java.io.IOException {
    java.net.HttpURLConnection connect = getConnection(path);
    connect.setRequestProperty("Authorization", ("Basic " + (org.exist.http.RESTServiceTest.credentials)));
    connect.setRequestMethod("POST");
    connect.setDoOutput(true);
    connect.setRequestProperty("Content-Type", "application/xml");
    java.io.Writer writer = new java.io.OutputStreamWriter(connect.getOutputStream(), "UTF-8");
    writer.write(content);
    writer.close();
    return connect;
}