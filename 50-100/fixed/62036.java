public int insertOne(java.lang.String name, java.lang.String nalja, int pay) throws java.sql.SQLException {
    java.lang.String sql = "insert into simple02 (name,nalja,pay) ";
    sql += " values (?,?,?)";
    java.lang.Object[] objs = new java.lang.Object[]{ name , nalja , pay };
    com.hb.day03.support.UpdateJDBCTemplate jdbc = new com.hb.day03.support.UpdateJDBCTemplate();
    return jdbc.executeUpdate(sql, objs);
}