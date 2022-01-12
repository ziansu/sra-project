void connect(java.nio.channels.Selector selector, java.net.InetSocketAddress socketAddress) {
    resolving = false;
    try {
        socketChannel = java.nio.channels.SocketChannel.open();
        socketChannel.configureBlocking(false);
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
    try {
        socketChannel.connect(socketAddress);
        add(selector, java.nio.channels.SelectionKey.OP_CONNECT);
    } catch (java.io.IOException e) {
        startClose();
    }
}