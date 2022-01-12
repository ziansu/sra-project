public void read(java.net.DatagramSocket socket, int size) throws java.io.IOException {
    reset(size);
    java.net.DatagramPacket dp = new java.net.DatagramPacket(buffer, 0, buffer.length);
    socket.receive(dp);
    writeOffset = dp.getLength();
    readOffset = 0;
}