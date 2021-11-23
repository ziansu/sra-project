public boolean isUserRegistered(java.lang.String username) throws java.sql.SQLException {
    java.lang.String sql = "SELECT username FROM user WHERE user =?";
    stat = con.prepareStatement(sql);
    java.sql.ResultSet rs = stat.executeQuery();
    CardGame.FunctionDB.free(rs, stat, con);
    if ((rs.next()) == false) {
        return false;
    }else {
        return true;
    }
}