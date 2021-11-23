private boolean putNewTask(TASK newTask) {
    java.lang.String url = newTask.getKey();
    boolean s = mExecuteQueue.offer(newTask);
    android.util.Log.w(com.arialyy.aria.core.queue.pool.ExecutePool.TAG, ("任务添加" + (s ? "成功" : ("失败，【" + url) + "】")));
    if (s) {
        newTask.start();
        mExecuteArray.put(com.arialyy.aria.util.CommonUtil.keyToHashKey(url), newTask);
    }
    return s;
}