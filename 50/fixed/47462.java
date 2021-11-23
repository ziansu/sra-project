private static void executeUpdate(java.sql.Connection conn, java.lang.String command) throws java.sql.SQLException {
    java.sql.Statement stmt;
    stmt = conn.createStatement();
    stmt.executeUpdate(command);
}