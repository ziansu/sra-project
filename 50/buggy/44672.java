public void refreshTaskManagerView() {
    if (DEBUG)
        android.util.Log.e(TAG, "refreshTaskManagerView");
    
    setTaskManagerTitle();
    loadRunningTasks();
    refreshMemoryUsagePanel();
    inflateTaskListView();
}