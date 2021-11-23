private void terminateConnection(int id) throws java.io.IOException {
    chatroom.ClientHandler client = clients.get(id);
    client.sendDisconnectRequest(new chatroom.Disconnect(((getMyIP()) + "has disconnected")));
    clients.get(id).closeConnection();
    clients.remove(client);
}