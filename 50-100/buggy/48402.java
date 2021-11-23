public void read(java.net.DatagramSocket socket, int size) throws java.io.IOException {
    reset(size);
    java.net.DatagramPacket dp = new java.net.DatagramPacket(buffer, 0, buffer.length);
    socket.receive(dp);
    byte[] newBuffer = new byte[dp.getLength()];
    for (int i = 0; i < (newBuffer.length); i++) {
        newBuffer[i] = buffer[i];
    }
    buffer = newBuffer;
    writeOffset = buffer.length;
    readOffset = 0;
}