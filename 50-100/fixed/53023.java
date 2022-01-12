@org.junit.Test
public void testRunJobWithoutAutoCommit() throws java.lang.Exception {
    ch.alv.batches.commons.sql.JooqBatchWriter writer = new ch.alv.batches.commons.sql.JooqBatchWriter(jooq);
    org.springframework.batch.core.Job j = dummyJobs.buildDummyJob("jooqBatchWriterTest", 20, new ch.alv.batches.commons.sql.TestJooqRecordReader(100), writer);
    org.junit.Assert.assertEquals(ExitStatus.COMPLETED, springBatchHelper.runJob(j));
    org.junit.Assert.assertEquals(100, jooq.fetchCount(ch.alv.batches.commons.sql.jooq.Tables.TEST_JOOQ));
}