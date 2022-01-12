private void writeFiletoLocal(java.nio.ByteBuffer buf) throws java.io.IOException {
    while (buf.hasRemaining()) {
        fileChannel.write(buf);
    } 
}