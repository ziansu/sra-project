private void registerUser(me.thamma.serverutils.ServerNewConnectionHandler handler) throws java.io.IOException {
    me.thamma.serverutils.ServerConnection connection = new me.thamma.serverutils.ServerConnection(clients.size(), server.accept());
    connection.message(("" + (connection.getId())));
    handler.handle(this, connection);
    clients.add(connection);
}