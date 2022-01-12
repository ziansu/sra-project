@org.junit.Test
public void testQuery() throws java.sql.SQLException {
    for (int i = 0; i < 10; i++) {
        java.util.List<com.rockson.sqls.SqlsTest.Bean> r = com.rockson.sqls.Sqls.query(com.rockson.sqls.SqlsTest.con, "select id,i1,d1 from test", null, com.rockson.sqls.SqlsTest.Bean.class);
        java.lang.System.out.println(r);
    }
}