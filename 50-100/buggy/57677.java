public void removeConnection(server.Packet00Disconnect disconnectPacket) {
    server.ServerPlayer disconnectingPlayer = null;
    for (server.ServerPlayer p : this.connectedPlayers)
        if (p.getUsername().equalsIgnoreCase(disconnectPacket.getUsername()))
            disconnectingPlayer = p;
        
    
    if (disconnectingPlayer != null) {
        this.connectedPlayers.remove(disconnectingPlayer);
        delegate.serverDidRemovePlayer(disconnectingPlayer);
    }
    this.sendDataToAllClients(disconnectPacket.getData());
}