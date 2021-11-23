public void testEscape(java.lang.String sql, java.lang.String expected) throws java.lang.Exception {
    java.lang.String tmp = con.nativeSQL(sql);
    java.lang.System.out.println(tmp);
    assertEquals(expected, tmp);
}