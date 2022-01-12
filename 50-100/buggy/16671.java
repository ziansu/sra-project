public java.net.DatagramPacket makeBroadcastPacket() throws java.io.IOException {
    datatype.Packet packet = new datatype.Packet(java.net.Inet4Address.getLocalHost(), java.net.Inet4Address.getLocalHost(), (-1), 3, new datatype.BroadcastMessage(nickname, client.getDestinations()));
    return packet.makeDatagramPacket();
}