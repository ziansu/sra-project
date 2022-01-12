private static void shutdown() {
    try {
        if ((ConcurrentAlignment.stmt) != null) {
            ConcurrentAlignment.stmt.close();
        }
        if ((ConcurrentAlignment.conn) != null) {
            java.sql.DriverManager.getConnection(((ConcurrentAlignment.dbURL) + ";shutdown=true"));
            ConcurrentAlignment.conn.close();
        }
    } catch (java.sql.SQLException sqlExcept) {
        sqlExcept.printStackTrace();
    }
}