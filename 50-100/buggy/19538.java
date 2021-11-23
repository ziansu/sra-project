@java.lang.Override
public int onTaskEnd(int taskID, java.lang.Object userContext, int errType, int errCode) {
    final com.tencent.mars.sample.wrapper.remote.MarsTaskWrapper wrapper = com.tencent.mars.sample.wrapper.service.MarsServiceStub.TASK_ID_TO_WRAPPER.remove(taskID);
    if (wrapper == null) {
        com.tencent.mars.xlog.Log.w(com.tencent.mars.sample.wrapper.service.MarsServiceStub.TAG, "stn task onTaskEnd callback may fail, null wrapper, taskID=%d", taskID);
        return 0;
    }
    try {
        wrapper.onTaskEnd();
    } catch (android.os.RemoteException e) {
        e.printStackTrace();
    } finally {
        com.tencent.mars.sample.wrapper.service.MarsServiceStub.WRAPPER_TO_TASK_ID.remove(wrapper);
    }
    return 0;
}