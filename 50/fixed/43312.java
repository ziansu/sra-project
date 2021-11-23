public void closeConnection() {
    try {
        this.connection.close();
    } catch (java.sql.SQLException e) {
    }
}