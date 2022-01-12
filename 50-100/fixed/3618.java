public boolean UserExist(java.lang.String username) {
    com.datastax.driver.core.Session session = cluster.connect("instagrim");
    com.datastax.driver.core.PreparedStatement ps = session.prepare("select login from userprofiles where login =?");
    com.datastax.driver.core.ResultSet rs = null;
    com.datastax.driver.core.BoundStatement boundStatement = new com.datastax.driver.core.BoundStatement(ps);
    rs = session.execute(boundStatement.bind(username));
    if (rs.isExhausted()) {
        java.lang.System.out.println("User Not Found, Good");
        return false;
    }else {
        return true;
    }
}