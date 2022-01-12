public void acknowledgePacket(client.Packet packet) throws java.io.IOException {
    long sequenceNumber = packet.getSequenceNumber();
    long acknowledgementNumber = (packet.getSequenceNumber()) + 1;
    client.Message message = new client.AckMessage(acknowledgementNumber);
    client.Packet acknowledgementPacket = new client.Packet(packet.getSourceAddress(), packet.getDestinationAddress(), sequenceNumber, 3, message);
    sender.sendPkt(acknowledgementPacket.makeDatagramPacket(socket.getInetAddress(), socket.getPort()));
}