public void beginTransaction(java.lang.String address, int port, java.lang.String name, java.lang.String username, java.lang.String password) {
    java.sql.Connection connection = newConnection(address, port, name, username, password);
    beginTransaction(connection);
    me.gerenciar.sdao.factory.DAOFactory.threadLocal.set(connection);
}