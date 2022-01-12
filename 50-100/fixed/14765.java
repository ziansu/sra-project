private void registerUser(me.thamma.serverutils.ServerNewConnectionHandler handler) throws java.io.IOException {
    me.thamma.serverutils.ServerConnection connection = new me.thamma.serverutils.ServerConnection(clients.size(), server.accept());
    connection.message(("" + (connection.getId())));
    clients.add(connection);
    handler.handle(this, connection);
}