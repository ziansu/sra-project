private java.lang.String getColumnName(java.lang.String table, int i) {
    java.lang.String result = "";
    java.lang.String querySql = java.lang.String.format("SELECT * FROM %s", table);
    try (java.sql.PreparedStatement stmt = con.prepareStatement(querySql, java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE, java.sql.ResultSet.CONCUR_READ_ONLY)) {
        try (java.sql.ResultSet rs = stmt.executeQuery()) {
            java.sql.ResultSetMetaData rsmd = rs.getMetaData();
            result = rsmd.getColumnName(i);
        }
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return result;
}