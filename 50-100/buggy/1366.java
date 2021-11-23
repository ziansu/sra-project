public void close() {
    try {
        if ((result) != null) {
            result.close();
        }
        if ((statement) != null) {
            statement.close();
        }
        if ((conn) != null) {
            conn.close();
        }
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("An error occurred when closing the connections");
    }
}