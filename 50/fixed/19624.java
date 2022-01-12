@org.junit.Test
public void testSelectGreaterThan() throws java.lang.Exception {
    io.crate.action.sql.SQLResponse response = io.crate.integrationtests.SysShardsTest.transportExecutor.exec("select * from sys.shards where num_docs > 0");
    assertThat(response.rowCount(), greaterThan(0L));
}