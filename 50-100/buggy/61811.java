public java.sql.ResultSet runQuery(java.lang.String query) {
    java.sql.ResultSet rs = null;
    try {
        java.sql.Statement st = con.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE, java.sql.ResultSet.CONCUR_READ_ONLY);
        rs = st.executeQuery(query);
    } catch (java.sql.SQLException ex) {
        java.lang.System.out.println("SQL ERROR runQuery");
        java.lang.System.out.println(query);
        ex.printStackTrace();
    }
    return rs;
}