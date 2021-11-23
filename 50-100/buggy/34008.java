@org.junit.Test
public void testSelectGroupByHaving() throws java.lang.Exception {
    io.crate.action.sql.SQLResponse response = io.crate.integrationtests.SysShardsTest.transportExecutor.exec(("select count(*) " + (("from sys.shards " + "group by table_name ") + "having table_name = 'quotes'")));
    assertThat(io.crate.testing.TestingHelpers.printedTable(response.rows()), org.hamcrest.Matchers.is("10\n"));
}