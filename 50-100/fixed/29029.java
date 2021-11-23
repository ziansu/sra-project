@org.junit.Test(expected = io.minio.InvalidExpiresRangeException.class)
public void testPresignGetObjectFail() throws io.minio.MinioException, java.io.IOException, java.security.InvalidKeyException, java.security.NoSuchAlgorithmException, org.xmlpull.v1.XmlPullParserException {
    com.squareup.okhttp.mockwebserver.MockWebServer server = new com.squareup.okhttp.mockwebserver.MockWebServer();
    server.start();
    io.minio.MinioClient client = new io.minio.MinioClient(server.url(""));
    client.presignedGetObject("bucket", "key", 604801);
}