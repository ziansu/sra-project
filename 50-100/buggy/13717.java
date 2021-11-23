private void quit() {
    for (int i = 0; i < (clients.size()); i++) {
        com.chatapp.server.ServerClient c = clients.get(i);
        disconnect(c.getID(), true);
    }
    sendToAll(new com.chatapp.networking.Packet(ID, Packet.Type.MESSAGE, "Server has shutdown."));
    console("Server has shutdown.");
    running = false;
    socket.close();
}