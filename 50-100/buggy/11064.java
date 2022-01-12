public void sendPartCommand(org.ukiuni.irc4j.server.ClientConnection partConnection) throws java.io.IOException {
    java.util.List<org.ukiuni.irc4j.server.ClientConnection> sendClients = new java.util.ArrayList<org.ukiuni.irc4j.server.ClientConnection>(joinedConnectionList);
    for (org.ukiuni.irc4j.server.ClientConnection clientConnection : sendClients) {
        try {
            clientConnection.sendPartCommand(partConnection, this);
        } catch (java.lang.Exception e) {
            ircServer.removeConnection(clientConnection.getNickName());
            org.ukiuni.irc4j.Log.log(e);
        }
    }
}