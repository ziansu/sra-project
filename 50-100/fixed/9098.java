private io.druid.indexing.jdbc.JDBCIndexTask createTask(final java.lang.String taskId, final io.druid.indexing.jdbc.JDBCIOConfig ioConfig, final java.lang.Integer maxRowsPerSegment, final java.lang.Boolean resetOffsetAutomatically) {
    io.druid.indexing.jdbc.JDBCIndexTaskTest.offsets.put(0, 0);
    final io.druid.indexing.jdbc.JDBCTuningConfig tuningConfig = new io.druid.indexing.jdbc.JDBCTuningConfig(1000, maxRowsPerSegment, new org.joda.time.Period("P1Y"), null, null, null, buildV9Directly, reportParseExceptions, handoffConditionTimeout, resetOffsetAutomatically);
    final io.druid.indexing.jdbc.JDBCIndexTask task = new io.druid.indexing.jdbc.JDBCIndexTask(taskId, null, io.druid.indexing.jdbc.JDBCIndexTaskTest.DATA_SCHEMA, tuningConfig, ioConfig, null, null);
    task.setPollRetryMs(io.druid.indexing.jdbc.JDBCIndexTaskTest.POLL_RETRY_MS);
    return task;
}