public void testCombat() throws java.lang.Exception, java.sql.SQLException {
    this.benchmark.createDatabase();
    com.oltpbenchmark.api.Worker w = workers.get(0);
    com.oltpbenchmark.benchmarks.galaxy.procedures.Combat proc = w.getProcedure(com.oltpbenchmark.benchmarks.galaxy.procedures.Combat.class);
    if (proc != null) {
        new com.oltpbenchmark.benchmarks.galaxy.util.TestCombat().run(conn, proc, new java.util.Random());
    }
}