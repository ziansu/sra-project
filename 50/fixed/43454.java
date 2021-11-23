public boolean closeConnection() throws java.sql.SQLException {
    if ((this.connection) == null) {
        return false;
    }
    this.connection.close();
    return true;
}