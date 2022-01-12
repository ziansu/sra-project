public java.lang.String getWhoBanned(java.lang.String IP) throws java.sql.SQLException {
    ps = ((java.sql.PreparedStatement) (con.prepareStatement("SELECT * FROM MythBans_IPCache WHERE IP_ADDRESS = ?")));
    ps.setString(1, IP);
    rs = ps.executeQuery();
    while (rs.next()) {
        return rs.getString("byUUID");
    } 
    return "NO_USER_FOUND";
}