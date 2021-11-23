public void refreshTaskManagerView() {
    loadRunningTasks();
    refreshMemoryUsagePanel();
    inflateTaskListView();
}