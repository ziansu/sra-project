private void doAccept(java.nio.channels.SelectionKey key) throws java.io.IOException {
    java.nio.channels.SocketChannel sc = serverSocketChannel.accept();
    sc.configureBlocking(false);
    java.nio.channels.SelectionKey clientKey = sc.register(selector, java.nio.channels.SelectionKey.OP_READ);
    clientKey.attach(new server.TaskContext(clientKey, server.Server.BUFF_SIZE));
}