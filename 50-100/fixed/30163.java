public void send(java.nio.ByteBuffer data) {
    if (!(isConnected())) {
        throw new com.jme3.network.kernel.KernelException(("Endpoint is not connected:" + (this)));
    }
    java.net.DatagramPacket p = new java.net.DatagramPacket(data.array(), data.position(), data.remaining(), address);
    kernel.enqueueWrite(this, p);
}