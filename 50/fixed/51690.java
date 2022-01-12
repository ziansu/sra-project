public void recordValue(java.time.Instant now, long val) {
    recordRaw(new org.apache.cassandra.hists.OpLogger.RecVal(now, val, null));
}