public void update(java.util.Observable o, java.lang.Object arg) {
    try {
        server.PokerGamePacket packet = new server.PokerGamePacket(game);
        outToClient.writeObject(packet);
        outToClient.flush();
    } catch (java.io.IOException e) {
        java.lang.System.err.println(((player.getUsername()) + " disconnected."));
    }
}