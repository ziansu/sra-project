public int getUserTotalScore(java.lang.String username, java.sql.Connection connection) {
    if (connection == null)
        return sourcePackage.Database.NO_CONNECTION;
    
    try {
        java.sql.PreparedStatement ps = connection.prepareStatement((("select 'total_score' from " + (MyDBInfo.MYSQL_DATABASE_NAME)) + ".users where id = ?;"));
        ps.setInt(1, getUserId(username, connection));
        java.sql.ResultSet rs = ps.executeQuery();
        if (rs == null)
            return sourcePackage.Database.NO_CONNECTION;
        
        rs.next();
        return rs.getInt(1);
    } catch (java.lang.Exception e) {
        return sourcePackage.Database.NO_CONNECTION;
    }
}