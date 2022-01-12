public void closeConnection() throws java.sql.SQLException {
    try {
        connection.close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}