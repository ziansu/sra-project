@java.lang.Override
public org.apache.hadoop.hdfs.server.blockmanagement.BlockInfo getLastBlock() throws io.hops.exception.StorageException, java.io.IOException {
    if ((lastBlockId) < 0) {
        return null;
    }
    return io.hops.transaction.EntityManager.find(BlockInfo.Finder.ByBlockIdAndINodeId, lastBlockId, getId());
}