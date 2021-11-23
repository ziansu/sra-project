public void cancel(long uid) {
    if (mLocal) {
        com.ttenushko.tasks.TaskResultReceiver.RemoteCallback<com.ttenushko.tasks.ITaskCancelListener, java.lang.Long> cancelListener;
        if (null != (cancelListener = mCancelListeners.get(uid))) {
            try {
                cancelListener.callback().cancelTask();
            } catch (android.os.RemoteException e) {
            }
        }
        return ;
    }
    throw new java.lang.UnsupportedOperationException("Can't get called remotely");
}