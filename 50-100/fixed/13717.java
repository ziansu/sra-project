private void quit() {
    sendToAll(new com.chatapp.networking.Packet(ID, Packet.Type.MESSAGE, "Server has shutdown."));
    for (int i = 0; i < (clients.size()); i++) {
        com.chatapp.server.ServerClient c = clients.get(i);
        disconnect(c.getID(), true);
    }
    console("Server has shutdown.");
    running = false;
    socket.close();
}