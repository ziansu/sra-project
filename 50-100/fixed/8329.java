@org.junit.Test(expected = io.minio.InvalidAclNameException.class)
public void testSetNullAclFails() throws io.minio.MinioException, java.io.IOException, java.security.InvalidKeyException, java.security.NoSuchAlgorithmException, org.xmlpull.v1.XmlPullParserException {
    com.squareup.okhttp.mockwebserver.MockWebServer server = new com.squareup.okhttp.mockwebserver.MockWebServer();
    com.squareup.okhttp.mockwebserver.MockResponse response = new com.squareup.okhttp.mockwebserver.MockResponse();
    response.addHeader("Date", "Sun, 29 Jun 2015 22:01:10 GMT");
    response.setResponseCode(200);
    server.enqueue(response);
    server.start();
    io.minio.MinioClient client = new io.minio.MinioClient(server.url(""));
    client.makeBucket("bucket");
    client.setBucketAcl("bucket", null);
    throw new java.lang.RuntimeException("Expected exception did not fire");
}