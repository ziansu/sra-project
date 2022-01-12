public java.sql.ResultSet getResultSetForQuery(java.lang.String query) {
    java.sql.Connection conn = createConnection();
    java.sql.ResultSet rs = null;
    try {
        rs = conn.createStatement().executeQuery(query);
        conn.close();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(((("Exception while running query" + query) + " Exception : ") + (e.getMessage())));
    }
    return rs;
}