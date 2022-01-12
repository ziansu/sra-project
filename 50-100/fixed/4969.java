@org.junit.Test(expected = io.minio.ErrorResponseException.class)
public void testForbidden() throws io.minio.MinioException, java.io.IOException, java.security.InvalidKeyException, java.security.NoSuchAlgorithmException, org.xmlpull.v1.XmlPullParserException {
    com.squareup.okhttp.mockwebserver.MockWebServer server = new com.squareup.okhttp.mockwebserver.MockWebServer();
    server.enqueue(new com.squareup.okhttp.mockwebserver.MockResponse().setResponseCode(403));
    server.start();
    io.minio.MinioClient client = new io.minio.MinioClient(server.url(""));
    client.statObject("bucket", "key");
    throw new java.lang.RuntimeException("Expected exception did not fire");
}