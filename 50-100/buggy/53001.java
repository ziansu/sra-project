@java.lang.Override
public void send(com.firefly.client.http2.MetaData.Request request, java.util.Collection<java.nio.ByteBuffer> buffers, com.firefly.client.http2.ClientHTTPHandler handler) {
    try (com.firefly.client.http2.HTTPOutputStream output = getHTTPOutputStream(request, handler)) {
        if (buffers != null) {
            output.writeWithContentLength(buffers);
        }
    } catch (java.io.IOException e) {
        generator.reset();
        com.firefly.client.http2.HTTP1ClientConnection.log.error("client generates the HTTP message exception", e);
    }
}