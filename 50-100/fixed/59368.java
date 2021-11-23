@java.lang.Override
public void stopAllTask() {
    for (java.lang.String key : mExecutePool.getAllTask().keySet()) {
        TASK task = mExecutePool.getAllTask().get(key);
        if ((task != null) && (task.isRunning()))
            task.stop();
        
    }
    for (java.lang.String key : mCachePool.getAllTask().keySet()) {
        mCachePool.removeTask(key);
    }
}