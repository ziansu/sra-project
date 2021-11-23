private void handleLogin(packets.Packet00Login packet, java.net.InetAddress adress, int port) {
    player = new projectv2.PlayerMP(((packets.Packet00Login) (packet)).getUsername(), packet.getX(), packet.getY(), packet.getRotate(), 0, adress, port);
    addConnection(player, ((packets.Packet00Login) (packet)));
}