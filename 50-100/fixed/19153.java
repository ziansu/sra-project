public boolean isUserRegistered(java.lang.String username) throws java.sql.SQLException {
    java.lang.String sql = "SELECT username FROM user WHERE user =?";
    stat = con.prepareStatement(sql);
    java.sql.ResultSet rs = stat.executeQuery();
    if ((rs.next()) == false) {
        CardGame.FunctionDB.free(rs, stat, con);
        return false;
    }else {
        CardGame.FunctionDB.free(rs, stat, con);
        return true;
    }
}