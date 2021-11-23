public void start(org.jumpmind.symmetric.io.data.DataContext ctx, org.jumpmind.symmetric.io.data.Batch batch) {
    batchStartsToArriveTimeInMs = java.lang.System.currentTimeMillis();
    processInfo.setStatus(ProcessInfo.ProcessStatus.TRANSFERRING);
    if ((batch.getStatistics()) != null) {
        processInfo.setDataCount(batch.getStatistics().get(DataReaderStatistics.DATA_ROW_COUNT));
    }
}