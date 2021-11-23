public boolean checkConnection() throws java.sql.SQLException {
    return ((connection) != null) && (!(connection.isClosed()));
}