private void cancelSpecifiedTaskWrapper(com.tencent.mars.sample.wrapper.remote.MarsTaskWrapper marsTaskWrapper) {
    if (queue.remove(marsTaskWrapper)) {
        try {
            marsTaskWrapper.onTaskEnd();
        } catch (android.os.RemoteException e) {
            e.printStackTrace();
            com.tencent.mars.xlog.Log.e(com.tencent.mars.sample.wrapper.remote.MarsServiceProxy.TAG, "cancel mars task wrapper in client, should not catch RemoteException");
        }
    }else {
        try {
            service.cancel(marsTaskWrapper);
        } catch (android.os.RemoteException e) {
            e.printStackTrace();
            com.tencent.mars.xlog.Log.w(com.tencent.mars.sample.wrapper.remote.MarsServiceProxy.TAG, "cancel mars task wrapper in remote service failed, I'll make marsTaskWrapper.onTaskEnd");
        }
    }
}