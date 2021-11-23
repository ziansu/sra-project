public int deleteOne(int sabun) throws java.sql.SQLException {
    java.lang.String sql = "detete from simple02 where sabun=?";
    com.hb.day03.support.UpdateJDBCTemplate jdbc = new com.hb.day03.support.UpdateJDBCTemplate(conn);
    return jdbc.executeUpdate(sql, new java.lang.Object[]{ sabun });
}