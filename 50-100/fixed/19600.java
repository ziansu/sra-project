public void markTaskIncomplete(ScheduleHacks.Task task) {
    task.setAsIncomplete();
    if (task.isFloatingTask()) {
        floatingTasksComplete.remove(task);
        addTask(task, true, 0);
    }else
        if (task.isScheduledTask()) {
            scheduledTasksComplete.remove(task);
            addTask(task, true, 0);
        }
    
}