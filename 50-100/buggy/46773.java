public static java.sql.ResultSet executeQuerey(java.sql.Connection conn, java.lang.String command) {
    java.sql.Statement stmt = null;
    try {
        stmt = conn.createStatement();
        return stmt.executeQuery(command);
    } catch (java.sql.SQLException e) {
        java.lang.System.err.println(("Error executing " + command));
        e.printStackTrace();
    }
    return null;
}