protected static java.nio.ByteBuffer handleBufferUnderflow(javax.net.ssl.SSLEngine engine, java.nio.ByteBuffer buffer) {
    if ((buffer.position()) < (buffer.limit())) {
        return buffer;
    }else {
        java.nio.ByteBuffer replaceBuffer = io.datakernel.eventloop.TcpSocketConnection.enlargePacketBuffer(engine, buffer);
        buffer.flip();
        replaceBuffer.put(buffer);
        return replaceBuffer;
    }
}