@org.junit.Test
public void returnsTheInputStreamOfTheSocket() throws java.lang.Exception {
    inputStream = new java.io.ByteArrayInputStream("GET / HTTP/1.1".getBytes());
    byteArrayOutputStream = new java.io.ByteArrayOutputStream();
    byteArrayOutputStream.write("HTTP/1.1 200 OK".getBytes());
    mocks.MockSocket mockSocket = new mocks.MockSocket(inputStream, byteArrayOutputStream);
    RequestHandler requestHandler = new RequestHandler(mockSocket);
    SocketWrapper socketWrapper = new SocketWrapper(mockSocket);
    org.junit.Assert.assertEquals(socketWrapper.getSocketInputStream(), requestHandler.getInputStream());
}