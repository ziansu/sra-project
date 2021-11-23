public void runTask(int type, me.kapehh.main.pluginmanager.thread.IPluginAsyncTask iPluginAsyncTask, int id, java.lang.Object obj, java.lang.Throwable throwable) {
    if ((obj == null) && (throwable == null))
        return ;
    
    syncTasks.add(new me.kapehh.main.pluginmanager.thread.PluginSyncTask(type, id, iPluginAsyncTask, obj, throwable));
}