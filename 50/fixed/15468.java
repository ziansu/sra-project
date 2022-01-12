public void add(org.bds.task.Task task) {
    synchronized(taskToLaunch) {
        taskToLaunch.add(task);
    }
}