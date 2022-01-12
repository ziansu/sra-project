@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
public void reset() {
    if ((mLocalBlockWorkerClientPool) != null) {
        mLocalBlockWorkerClientPool.close();
    }
    mLocalBlockWorkerClientPoolInitialized = false;
    if (null != (mBlockMasterClientPool)) {
        return ;
    }
    mBlockMasterClientPool = new alluxio.client.block.BlockMasterClientPool(alluxio.client.ClientContext.getMasterAddress());
}