public void send(byte channel, byte[] dataRaw) throws java.io.IOException {
    byte[] data = java.nio.ByteBuffer.allocate(((dataRaw.length) + 1)).put(channel).put(dataRaw, 0, dataRaw.length).array();
    java.net.DatagramPacket packet = new java.net.DatagramPacket(data, data.length, target);
    socket.send(packet);
}