@java.lang.Override
public void removeAllTask() {
    java.util.Set<java.lang.String> exeKeys = mExecutePool.getAllTask().keySet();
    for (java.lang.String key : exeKeys) {
        TASK task = mExecutePool.getAllTask().get(key);
        if (task != null)
            task.cancel();
        
    }
    java.util.Set<java.lang.String> cacheKeys = mCachePool.getAllTask().keySet();
    for (java.lang.String key : cacheKeys) {
        mExecutePool.removeTask(key);
    }
}