public boolean updateDB(java.sql.Connection con, java.lang.String sqlStatement) {
    if (con != null) {
        try {
            java.sql.Statement stmt = con.createStatement();
            stmt.executeUpdate(sqlStatement);
            return true;
        } catch (java.sql.SQLException ex) {
            java.lang.System.out.println(ex.toString());
            return false;
        }
    }
    return false;
}