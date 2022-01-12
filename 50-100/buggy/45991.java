public int updateOne(int sabun, java.lang.String name, java.lang.String nalja, int pay) throws java.sql.SQLException {
    java.lang.String sql = "update simple02 set name=?,nalja=?,pay=? where sabun=?";
    java.lang.Object[] objs = new java.lang.Object[]{ name , nalja , pay , sabun };
    com.hb.day03.support.UpdateJDBCTemplate jdbc = new com.hb.day03.support.UpdateJDBCTemplate(conn);
    return jdbc.executeUpdate(sql, objs);
}