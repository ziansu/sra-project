public int executeQuery(java.lang.String query) {
    java.sql.Statement st;
    int lastID = 0;
    try {
        st = con.createStatement();
        int result = st.executeUpdate(query, java.sql.Statement.RETURN_GENERATED_KEYS);
        java.sql.ResultSet rs = st.getGeneratedKeys();
        if (rs.next()) {
            lastID = rs.getInt(1);
        }
    } catch (java.sql.SQLException ex) {
        ex.printStackTrace();
    }
    return lastID;
}