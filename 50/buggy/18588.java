@org.junit.Test
public void testSelectGroupByWhereTable() throws java.lang.Exception {
    io.crate.action.sql.SQLResponse response = io.crate.integrationtests.SysShardsTest.transportExecutor.exec(("" + ("select count(*), num_docs from sys.shards where table_name = 'characters' " + "group by num_docs order by count(*)")));
    assertThat(response.rowCount(), org.hamcrest.Matchers.greaterThan(0L));
}