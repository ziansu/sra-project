public void openSocket(java.lang.String serverHost, java.lang.String serverPort) throws java.io.IOException {
    while ((client) == null) {
        synchronized(this) {
            while ((client) == null) {
                client = java.nio.channels.SocketChannel.open();
                client.configureBlocking(false);
                client.connect(new java.net.InetSocketAddress(serverHost, java.lang.Integer.parseInt(serverPort)));
                selector = java.nio.channels.Selector.open();
                client.register(selector, java.nio.channels.SelectionKey.OP_CONNECT);
                notifyAll();
            } 
        }
    } 
}