private static java.nio.ByteBuffer enlargeApplicationBuffer(javax.net.ssl.SSLEngine engine, java.nio.ByteBuffer buffer) {
    return io.datakernel.eventloop.TcpSocketConnection.enlargeBuffer(buffer, engine.getSession().getApplicationBufferSize());
}