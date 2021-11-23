@javax.websocket.OnMessage
public void onBinaryFile(java.nio.ByteBuffer buf, javax.websocket.Session client) throws java.io.IOException, javax.websocket.EncodeException {
    if ((uploadFile) != null) {
        return ;
    }
    for (javax.websocket.Session other : client.getOpenSessions()) {
        javax.websocket.RemoteEndpoint.Async ep = other.getAsyncRemote();
        ep.sendObject(uploadFile);
        ep.sendBinary(buf);
    }
    uploadFile = null;
}