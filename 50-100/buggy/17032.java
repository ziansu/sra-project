private boolean tryRead(java.nio.channels.SelectionKey key, java.nio.ByteBuffer buffer) throws java.io.IOException {
    java.nio.channels.SocketChannel channel = ((java.nio.channels.SocketChannel) (key.channel()));
    int read = channel.read(buffer);
    if (read < 0) {
        channel.close();
        key.cancel();
        return false;
    }
    return !(requestHeader.hasRemaining());
}