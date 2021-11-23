@org.junit.Test
public void testPresignGetObject() throws io.minio.MinioException, java.io.IOException, java.security.InvalidKeyException, java.security.NoSuchAlgorithmException, org.xmlpull.v1.XmlPullParserException {
    com.squareup.okhttp.mockwebserver.MockWebServer server = new com.squareup.okhttp.mockwebserver.MockWebServer();
    server.start();
    io.minio.MinioClient client = new io.minio.MinioClient(server.url(""));
    java.lang.String presignedObjectUrl = client.presignedGetObject("bucket", "key");
    org.junit.Assert.assertEquals(presignedObjectUrl.isEmpty(), false);
}