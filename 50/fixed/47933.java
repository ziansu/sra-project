@java.lang.Override
public void close() throws java.io.IOException {
    try {
        connection.close();
        connection = null;
    } catch (java.sql.SQLException e) {
        ua.rbolck.rader.model.DatabaseConnection.log.error("SQLException while closing DatabaseConnection", e);
    }
    ua.rbolck.rader.model.DatabaseConnection.log.info("Closed connection");
}