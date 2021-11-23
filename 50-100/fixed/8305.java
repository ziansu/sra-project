@java.lang.Override
public void removeAllTask() {
    for (java.lang.String key : mExecutePool.getAllTask().keySet()) {
        TASK task = mExecutePool.getAllTask().get(key);
        if (task != null)
            task.cancel();
        
    }
    for (java.lang.String key : mCachePool.getAllTask().keySet()) {
        mCachePool.removeTask(key);
    }
}