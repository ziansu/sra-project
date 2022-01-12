private void completeConnection(java.nio.channels.SelectionKey key) throws java.io.IOException {
    java.nio.channels.SocketChannel socketChannel = ((java.nio.channels.SocketChannel) (key.channel()));
    try {
        java.lang.System.out.println("Connected to Server");
        socketChannel.finishConnect();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        key.cancel();
        return ;
    }
    key.interestOps(java.nio.channels.SelectionKey.OP_WRITE);
}