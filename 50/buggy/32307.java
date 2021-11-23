@java.lang.Override
public void destroy() throws java.lang.Exception {
    scheduledTasks.cancel(true);
}