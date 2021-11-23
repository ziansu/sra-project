@java.lang.Override
public boolean isReady(io.druid.indexing.common.actions.TaskActionClient taskActionClient) throws java.lang.Exception {
    boolean retVal = super.isReady(taskActionClient);
    lockAcquisitionLatch.countDown();
    return retVal;
}