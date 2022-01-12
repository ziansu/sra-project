public void removeConnection(server.Packet00Disconnect disconnectPacket) {
    server.ServerPlayer disconnectingPlayer = null;
    for (server.ServerPlayer p : connectedPlayers)
        if (p.getUsername().equalsIgnoreCase(disconnectPacket.getUsername()))
            disconnectingPlayer = p;
        
    
    if (disconnectingPlayer != null) {
        connectedPlayers.remove(disconnectingPlayer);
        delegate.serverDidRemovePlayer(disconnectingPlayer);
    }
    this.sendDataToAllClients(disconnectPacket.getData());
}