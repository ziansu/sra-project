public java.sql.ResultSet getData(java.lang.String query) {
    java.sql.ResultSet rs = null;
    try {
        java.sql.Statement stmt = conn.createStatement();
        rs = stmt.executeQuery(query);
    } catch (java.lang.Exception e) {
        java.lang.System.err.println("getData - Got an exception: ");
        java.lang.System.err.println(e.getMessage());
    }
    return rs;
}