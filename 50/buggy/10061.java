public void closeConnection(java.sql.Connection connection) throws java.sql.SQLException {
    try {
        connection.close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}