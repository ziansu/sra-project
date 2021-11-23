public void init() throws java.io.IOException {
    worker.start();
    selector = java.nio.channels.Selector.open();
    java.nio.channels.ServerSocketChannel ssChannel = java.nio.channels.ServerSocketChannel.open();
    ssChannel.configureBlocking(false);
    java.net.SocketAddress address = new java.net.InetSocketAddress(com.m32s.java.test.NewSmsSimulator.PORT);
    ssChannel.bind(address);
    ssChannel.register(selector, java.nio.channels.SelectionKey.OP_ACCEPT);
    this.setDaemon(true);
}