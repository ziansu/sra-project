private void decDfsUsedAndNumBlocks(java.lang.String bpid, long value, boolean blockFileDeleted) {
    try (org.apache.hadoop.util.AutoCloseableLock lock = dataset.acquireDatasetLock(true)) {
        org.apache.hadoop.hdfs.server.datanode.fsdataset.impl.BlockPoolSlice bp = bpSlices.get(bpid);
        if (bp != null) {
            bp.decDfsUsed(value);
            if (blockFileDeleted) {
                bp.decrNumBlocks();
            }
        }
    }
}