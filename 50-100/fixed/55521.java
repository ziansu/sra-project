public void sendRTPPacket(byte[] data) throws java.io.IOException {
    RTPPacket sendPacket;
    RTPHeader sendHeader = new RTPHeader(srcPort, dstPort, sequenceNumber);
    sendPacket = new RTPPacket(sendHeader, data);
    sendPacket.updateChecksum();
    data = sendPacket.getPacketByteArray();
    socket.send(new java.net.DatagramPacket(data, data.length, dstAddress, dstPort));
}