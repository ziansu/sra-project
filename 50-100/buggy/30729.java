public int getLatestTestID() {
    java.sql.Connection con = null;
    java.sql.Statement st = null;
    java.sql.ResultSet rs = null;
    try {
        con = getConnection();
        java.lang.String sql = "SELECT * FROM TESTS ORDER BY ID DESC";
        st = con.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            return rs.getInt("ID");
        } 
    } catch (java.sql.SQLException ex) {
        ex.printStackTrace();
    } finally {
        closeResources(rs, st, con);
    }
    return 0;
}