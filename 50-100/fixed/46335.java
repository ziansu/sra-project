@java.lang.Override
public void close() throws java.io.IOException {
    scanner.close();
    session.close();
    long totalOps = getRowsReadCount();
    long elapsedTimeMs = (java.lang.System.currentTimeMillis()) - (workStart);
    long operationsPerSecond = (elapsedTimeMs == 0) ? 0 : (totalOps * 1000) / elapsedTimeMs;
    com.google.cloud.bigtable.dataflow.CloudBigtableIO.Reader.READER_LOG.info("{} Complete: {} operations in {} ms. That's {} operations/sec", this, totalOps, elapsedTimeMs, operationsPerSecond);
}