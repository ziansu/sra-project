public boolean connectToServer(shared.ClientType client) {
    client.ClientConnector.clientType = client;
    try {
        client.ClientConnector.socket = new shared.SocketConnection(new java.net.Socket("localhost", 8189));
        client.ClientConnector.socket.writeObject(client);
        return true;
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(client.ClientConnector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        return false;
    }
}