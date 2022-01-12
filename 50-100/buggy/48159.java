private boolean schemaExists(java.sql.Connection con) throws java.sql.SQLException {
    boolean result;
    java.sql.PreparedStatement stmt = con.prepareStatement("SELECT * FROM sys.sysschemas WHERE SCHEMANAME=?", java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE, java.sql.ResultSet.CONCUR_READ_ONLY);
    stmt.setString(1, TableNameKeys.SCHEMA_NAME.toUpperCase());
    java.sql.ResultSet rs = stmt.executeQuery();
    con.setAutoCommit(false);
    result = rs.isBeforeFirst();
    con.setAutoCommit(true);
    return result;
}