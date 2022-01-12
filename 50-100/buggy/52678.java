@org.junit.Test
public void testSelectWithOrderByColumnNotInOutputs() throws java.lang.Exception {
    io.crate.action.sql.SQLResponse response = io.crate.integrationtests.SysShardsTest.transportExecutor.exec("select id from sys.shards order by table_name limit 1");
    assertThat(response.rowCount(), org.hamcrest.Matchers.is(1L));
    assertThat(response.rows()[0][0], org.hamcrest.Matchers.instanceOf(java.lang.Integer.class));
}