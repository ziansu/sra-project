private void checkExplain(java.sql.Statement stat, java.lang.String sql, java.lang.String expected) throws java.sql.SQLException {
    java.sql.ResultSet rs = stat.executeQuery(sql);
    assertTrue(rs.next());
    assertEquals(expected, rs.getString(1));
}