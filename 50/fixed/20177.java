public java.lang.String PokeItPacket(int playerTurn) {
    java.lang.String packet = "4,";
    packet = packet.concat(java.lang.Integer.toString((playerTurn + 1)));
    return packet;
}