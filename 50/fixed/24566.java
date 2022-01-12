@org.junit.Before
public final void before() throws java.lang.Exception {
    mLocalTachyonCluster = new tachyon.master.next.LocalTachyonCluster(tachyon.Constants.GB, 100, tachyon.Constants.GB);
    mLocalTachyonCluster.start();
    mTfs = mLocalTachyonCluster.getClient();
    mMasterTachyonConf = mLocalTachyonCluster.getMasterTachyonConf();
}