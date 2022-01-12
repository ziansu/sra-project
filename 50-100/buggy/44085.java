@org.junit.Test
public void testGroupByWithLimitUnassignedShards() throws java.lang.Exception {
    try {
        io.crate.integrationtests.SysShardsTest.transportExecutor.exec("create table t (id int, name string) with (number_of_replicas=2)");
        io.crate.integrationtests.SysShardsTest.transportExecutor.ensureYellow();
        io.crate.action.sql.SQLResponse response = io.crate.integrationtests.SysShardsTest.transportExecutor.exec("select sum(num_docs), table_name, sum(num_docs) from sys.shards group by table_name order by table_name desc limit 1000");
        assertThat(response.rowCount(), org.hamcrest.Matchers.is(4L));
        assertThat(io.crate.testing.TestingHelpers.printedTable(response.rows()), org.hamcrest.Matchers.is(("0.0| t| 0.0\n" + (("0.0| quotes| 0.0\n" + "14.0| characters| 14.0\n") + "0.0| blobs| 0.0\n"))));
    } finally {
        io.crate.integrationtests.SysShardsTest.transportExecutor.exec("drop table t");
    }
}