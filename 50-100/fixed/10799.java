@org.junit.Test
public void testKillNonExisitingJob() throws java.lang.Exception {
    java.util.UUID jobId = java.util.UUID.randomUUID();
    io.crate.action.sql.SQLResponse killResponse = execute("KILL ?", new java.lang.Object[]{ jobId });
    assertThat(killResponse.rowCount(), is(0L));
    io.crate.action.sql.SQLResponse logResponse = execute("select * from sys.jobs_log where error = ?", new java.lang.Object[]{ "KILLED" });
    assertThat(logResponse.rowCount(), is(0L));
}