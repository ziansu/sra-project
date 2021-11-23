@java.lang.Override
public void stopAllTask() {
    java.util.Set<java.lang.String> exeKeys = mExecutePool.getAllTask().keySet();
    for (java.lang.String key : exeKeys) {
        TASK task = mExecutePool.getAllTask().get(key);
        if ((task != null) && (task.isRunning()))
            task.stop();
        
    }
    java.util.Set<java.lang.String> cacheKeys = mCachePool.getAllTask().keySet();
    for (java.lang.String key : cacheKeys) {
        mExecutePool.removeTask(key);
    }
}