private static java.sql.ResultSet getUser(java.lang.String user_id) throws java.sql.SQLException {
    java.sql.PreparedStatement ps = null;
    java.sql.ResultSet rs = null;
    try {
        ps = me.funso.angtowerdefense.server.MySQLConnector.prepareStatement("SELECT * FROM tbl_user WHERE user_id=?");
        ps.setString(1, user_id);
        rs = ps.executeQuery();
        return rs;
    } finally {
        if (ps != null)
            ps.close();
        
        if (rs != null)
            rs.close();
        
    }
}