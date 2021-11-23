@org.junit.Test
public void returnsTheInputStreamOfTheSocket() throws java.lang.Exception {
    inputStream = new java.io.ByteArrayInputStream("GET / HTTP/1.1".getBytes());
    byteArrayOutputStream = new java.io.ByteArrayOutputStream();
    mocks.MockSocket mockSocket = new mocks.MockSocket(inputStream, byteArrayOutputStream);
    RequestHandler requestHandler = new RequestHandler(mockSocket);
    org.junit.Assert.assertEquals(inputStream, requestHandler.getInputStream());
}