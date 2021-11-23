public void sendToPlayer(java.util.UUID uuid, java.lang.Object message) {
    networkServer.sendToPlayer(networkServer.getPlayerFromUUID(uuid), new uno.network.api.Packet(uno.network.api.MessageType.MESSAGE, message));
}