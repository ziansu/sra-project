public boolean createTask(android.content.Context context, java.lang.String title, java.lang.String priority_s, long category) {
    int priority = com.infiniteloop.mytasks.Helpers.getPriority(context, priority_s);
    if (priority != (-1)) {
        com.infiniteloop.mytasks.Task t = new com.infiniteloop.mytasks.Task(title, priority, category);
        long taskId = saveTask(t);
        mTasks.add(t);
        return true;
    }
    return false;
}