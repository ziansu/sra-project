@org.junit.Test
public void testSinglePartitionDefinedInWindowList() throws java.lang.Exception {
    final java.lang.String query = "explain plan for select sum(a2) over w \n" + ("from cp.`tpch/nation.parquet` \n" + "window w as (partition by a2 order by a2)");
    test(query);
}