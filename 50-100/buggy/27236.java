static org.apache.hadoop.hdfs.server.protocol.ReplicaRecoveryInfo initReplicaRecovery(java.lang.String bpid, org.apache.hadoop.hdfs.server.datanode.fsdataset.impl.ReplicaMap map, org.apache.hadoop.hdfs.protocol.Block block, long recoveryId, long xceiverStopTimeout, org.apache.hadoop.util.AutoCloseableLock autoCloseableLock) throws java.io.IOException {
    if (autoCloseableLock == null) {
        autoCloseableLock = org.apache.hadoop.hdfs.server.datanode.fsdataset.impl.FsDatasetImpl.createDatasetWriteLock();
    }
    while (true) {
        try {
            try (org.apache.hadoop.util.AutoCloseableLock lock = autoCloseableLock.acquire()) {
                return org.apache.hadoop.hdfs.server.datanode.fsdataset.impl.FsDatasetImpl.initReplicaRecoveryImpl(bpid, map, block, recoveryId);
            }
        } catch (org.apache.hadoop.hdfs.server.datanode.fsdataset.impl.FsDatasetImpl.MustStopExistingWriter e) {
            e.getReplicaInPipeline().stopWriter(xceiverStopTimeout);
        }
    } 
}