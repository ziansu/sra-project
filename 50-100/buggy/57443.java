public boolean checkTable(java.lang.String tableName) {
    java.sql.Statement st;
    java.sql.ResultSet rs;
    try {
        st = conn.createStatement();
        rs = st.executeQuery(((("SELECT count(*) as res FROM INFORMATION_SCHEMA.TABLES WHERE " + ("TABLE_SCHEMA='PUBLIC' " + " AND TABLE_NAME='")) + tableName) + "'"));
        rs.next();
        return (rs.getInt(1)) == 1;
    } catch (java.sql.SQLException e) {
        return false;
    }
}