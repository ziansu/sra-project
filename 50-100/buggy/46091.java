protected void readDataFromSocket(java.nio.channels.SelectionKey key) throws java.lang.Exception {
    java.nio.channels.SocketChannel socketChannel = ((java.nio.channels.SocketChannel) (key.channel()));
    int count;
    buffer.clear();
    while ((count = socketChannel.read(buffer)) > 0) {
        buffer.flip();
        while (buffer.hasRemaining()) {
        } 
        socketChannel.write(buffer);
        buffer.clear();
    } 
    if (count < 0) {
        socketChannel.close();
    }
}