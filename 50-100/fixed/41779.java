@org.junit.Test
public void EmptyImageTest() throws java.lang.Exception {
    mLocalTachyonCluster.stopTFS();
    tachyon.master.next.filesystem.FileSystemMaster fsMaster = createFsMasterFromJournal();
    long rootId = fsMaster.getFileId(mRootUri);
    org.junit.Assert.assertTrue((rootId != (-1)));
    org.junit.Assert.assertEquals(0, fsMaster.getFileInfoList(rootId).size());
    fsMaster.stop();
}