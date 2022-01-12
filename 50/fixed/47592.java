@java.lang.Override
protected void setUp() throws java.lang.Exception {
    super.setUp(com.oltpbenchmark.benchmarks.galaxy.GalaxyBenchmark.class, TestGalaxyBenchmark.PROC_CLASSES);
    conn.setAutoCommit(true);
}