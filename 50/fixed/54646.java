@java.lang.Override
protected void startMaster() throws java.lang.Exception {
    mMaster = alluxio.master.LocalAlluxioMaster.create(mWorkDirectory);
    mMaster.start();
}