private int processConnect(java.nio.channels.SelectionKey selectionKey) {
    final org.reaktivity.nukleus.tcp.internal.connector.Request request = ((org.reaktivity.nukleus.tcp.internal.connector.Request) (selectionKey.attachment()));
    final java.nio.channels.SocketChannel channel = request.channel();
    try {
        channel.finishConnect();
        handleConnected(request);
    } catch (java.lang.Exception ex) {
        handleConnectFailed(request);
    } finally {
        selectionKey.cancel();
    }
    return 1;
}