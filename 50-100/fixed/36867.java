public static org.apache.hadoop.hdfs.server.blockmanagement.DatanodeDescriptor getLocalDatanodeDescriptor(boolean initializeStorage) {
    org.apache.hadoop.hdfs.server.blockmanagement.DatanodeDescriptor dn = new org.apache.hadoop.hdfs.server.blockmanagement.DatanodeDescriptor(new io.hops.metadata.StorageMap(false), org.apache.hadoop.hdfs.DFSTestUtil.getLocalDatanodeID());
    if (initializeStorage) {
        dn.updateStorage(new org.apache.hadoop.hdfs.server.protocol.DatanodeStorage(org.apache.hadoop.hdfs.server.protocol.DatanodeStorage.generateUuid()));
    }
    return dn;
}