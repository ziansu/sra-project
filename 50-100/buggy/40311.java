private void changeStatusToOverdue(int i) {
    addTaskInOrder(scheduledTasksOverDue, scheduledTasksToDo.get(i));
    setFeedBack((("Task " + (scheduledTasksToDo.get(i).getDescription())) + " has exceeded deadline"));
    scheduledTasksToDo.remove(i);
}