public org.pygephi.core.GLongTaskExecutor execute(final org.pygephi.core.GLongTask task, boolean doInBackground, java.lang.String taskName, float timeout) throws java.lang.Exception {
    if (longTasks.containsKey(taskName))
        throw new java.lang.Exception("task exists");
    
    org.pygephi.core.GLongTaskExecutor executor = new org.pygephi.core.GLongTaskExecutor(doInBackground, taskName, timeout);
    longTasks.put(taskName, executor);
    executor.execute(task);
    return executor;
}