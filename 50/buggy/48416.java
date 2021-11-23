private void changeFloatingToScheduledProcedures(ScheduleHacks.Task taskToModify) {
    floatingTasksToDo.remove(taskToModify);
    addTaskInOrder(scheduledTasksToDo, taskToModify);
    taskToModify.isScheduledTask();
    setFeedBack(Logic.Logic.FEEDBACK_TASK_MODIFIED);
}