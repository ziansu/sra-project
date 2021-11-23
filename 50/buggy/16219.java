public void beginTransaction() {
    java.sql.Connection connection = newConnection();
    beginTransaction(connection);
    me.gerenciar.sdao.factory.DAOFactory.threadLocalConnection.set(connection);
}