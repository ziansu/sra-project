@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
public void reset() {
    if ((mBlockMasterClientPool) != null) {
        mBlockMasterClientPool.close();
    }
    if ((mLocalBlockWorkerClientPool) != null) {
        mLocalBlockWorkerClientPool.close();
    }
    mBlockMasterClientPool = new alluxio.client.block.BlockMasterClientPool(alluxio.client.ClientContext.getMasterAddress());
    mLocalBlockWorkerClientPoolInitialized = false;
}