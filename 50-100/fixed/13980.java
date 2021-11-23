public vn.com.vndirect.socialtrading.entity.FollowerEntity getUser(java.lang.String user1, java.lang.String password1) throws java.sql.SQLException {
    java.sql.PreparedStatement stmt = connection.prepareStatement("SELECT * FROM account where  username =? and password =?");
    stmt.setString(1, user1);
    stmt.setString(2, password1);
    java.sql.ResultSet rs = stmt.executeQuery();
    vn.com.vndirect.socialtrading.entity.FollowerEntity follower = new vn.com.vndirect.socialtrading.entity.FollowerEntity();
    while (rs.next()) {
        follower = parseFollowerEntity(rs);
    } 
    return follower;
}