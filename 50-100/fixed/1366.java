public void close() {
    try {
        if ((result) != null) {
            result.close();
        }
        result = null;
        if ((statement) != null) {
            statement.close();
        }
        statement = null;
        if ((conn) != null) {
            conn.close();
        }
        conn = null;
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("An error occurred when closing the connections");
    }
}