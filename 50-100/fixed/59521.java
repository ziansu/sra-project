public void cancel(long uid) {
    com.ttenushko.tasks.TaskResultReceiver.RemoteCallback<com.ttenushko.tasks.ITaskCancelListener, java.lang.Long> cancelListener;
    if (null != (cancelListener = mCancelListeners.get(uid))) {
        try {
            cancelListener.callback().cancelTask();
        } catch (android.os.RemoteException e) {
        }
    }
}