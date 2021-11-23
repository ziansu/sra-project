@java.lang.Override
public void release() {
    synchronized(lock) {
        pause();
        mModeratorExecutor.executeAllPendingRunnable();
        mEventDispatcher.unregisterAllListener();
        mFileManager = null;
        mHttpClient = null;
        mTaskManager = null;
    }
}