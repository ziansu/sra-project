public void start(org.jumpmind.symmetric.io.data.DataContext ctx, org.jumpmind.symmetric.io.data.Batch batch) {
    batchStartsToArriveTimeInMs = java.lang.System.currentTimeMillis();
    processInfo.setStatus(ProcessInfo.ProcessStatus.TRANSFERRING);
    if ((ctx != null) && ((ctx.getStatistics()) != null)) {
        processInfo.setDataCount(ctx.getStatistics().get(DataReaderStatistics.DATA_ROW_COUNT));
    }
}