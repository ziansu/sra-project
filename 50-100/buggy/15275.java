@java.lang.Override
public void hasWon(java.util.List<java.util.UUID> receivers, java.util.UUID winner) {
    network.server.SocketClientHandler handler;
    for (java.util.UUID user : receivers) {
        handler = network.server.ComServer.connectedClients.get(user.toString());
        if (handler != null)
            handler.sendMessage(new network.messages.HasWonMessage(user));
        
    }
}