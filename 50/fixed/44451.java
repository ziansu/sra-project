public void commit() {
    recoveryMgr.commit();
    concurMgr.release();
    myBuffers.unpinAll();
}