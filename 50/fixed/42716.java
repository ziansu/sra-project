@org.junit.Test
public void testSinglePartition() throws java.lang.Exception {
    final java.lang.String query = "explain plan for select sum(a2) over(partition by a2), count(*) over(partition by a2) \n" + "from cp.`tpch/nation.parquet`";
    test(query);
}