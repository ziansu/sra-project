@java.lang.Override
public void run() {
    try (java.nio.channels.DatagramChannel channel = java.nio.channels.DatagramChannel.open()) {
        channel.socket().bind(new java.net.InetSocketAddress(this.port));
        final java.nio.ByteBuffer buf = java.nio.ByteBuffer.allocate(this.bufferSize);
        running.set(true);
        while (running.get()) {
            receivePacket(channel, buf);
        } 
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException("Could not start UDP receiver");
    }
    io.inkstand.scribble.net.UDPReceiver.UDPProcessor.LOG.info("Server stopped");
}