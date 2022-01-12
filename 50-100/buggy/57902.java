private void clientSetReady(java.net.Socket client, org.server.Player p, java.lang.String message) {
    java.lang.String[] splitMessage = message.split(":");
    this.ready.put(splitMessage[0], new org.server.ConnectionManager.SocketAndPlayer(client, p));
    if ((this.referenceClient) == null) {
        this.gameString = splitMessage[0];
        this.referenceClient = this.gameString;
    }
}