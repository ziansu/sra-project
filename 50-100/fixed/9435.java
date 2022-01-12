@com.google.common.annotations.VisibleForTesting
public long getDfsUsed() throws java.io.IOException {
    long dfsUsed = 0;
    try (org.apache.hadoop.util.AutoCloseableLock lock = dataset.acquireDatasetLock(true)) {
        for (org.apache.hadoop.hdfs.server.datanode.fsdataset.impl.BlockPoolSlice s : bpSlices.values()) {
            dfsUsed += s.getDfsUsed();
        }
    }
    return dfsUsed;
}