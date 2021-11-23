private static void writeChannelFully(java.nio.channels.WritableByteChannel ch, java.nio.ByteBuffer buf) throws java.io.IOException {
    while (buf.hasRemaining()) {
        int ret = ch.write(buf);
    } 
}