public void test_0() throws java.lang.Exception {
    java.lang.String sql = "SELECT * FROM pp_items WHERE uid= ORDER BY id DESC LIMIT ?,?";
    java.lang.Exception error = null;
    try {
        com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser parser = new com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser(sql);
        parser.parseStatementList();
    } catch (java.lang.Exception e) {
        error = e;
    }
    org.junit.Assert.assertNotNull(error);
}