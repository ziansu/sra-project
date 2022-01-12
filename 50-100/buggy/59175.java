@java.lang.Override
public void closeConnection() throws java.lang.Exception {
    this.jdbcSource.close();
    if ((this.dataConnection) != null) {
        try {
            this.dataConnection.close();
        } catch (java.sql.SQLException e) {
            this.log.error(("Failed to close connection ;error-" + (e.getMessage())), e);
        }
    }
}