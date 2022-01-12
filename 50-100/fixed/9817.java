@java.lang.Override
public com.firefly.client.http2.HTTPOutputStream sendRequestWithContinuation(com.firefly.client.http2.MetaData.Request request, com.firefly.client.http2.ClientHTTPHandler handler) {
    request.getFields().put(HttpHeader.EXPECT, HttpHeaderValue.CONTINUE);
    com.firefly.client.http2.HTTPOutputStream outputStream = getHTTPOutputStream(request, handler);
    try {
        outputStream.commit();
    } catch (java.io.IOException e) {
        com.firefly.client.http2.HTTP1ClientConnection.log.error("client generates the HTTP message exception", e);
    }
    return outputStream;
}