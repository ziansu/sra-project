public int executeQuery(java.lang.String query) {
    java.sql.Statement st;
    int lastID = 0;
    try {
        st = con.createStatement();
        int result = st.executeUpdate(query, java.sql.Statement.RETURN_GENERATED_KEYS);
        java.sql.ResultSet rs = st.getGeneratedKeys();
        if (rs.next()) {
            lastID = rs.getInt(1);
            java.lang.System.out.println(("ID changed: " + lastID));
        }
    } catch (java.sql.SQLException ex) {
        ex.printStackTrace();
    }
    return lastID;
}