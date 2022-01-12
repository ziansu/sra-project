private void processNormalTasksAndEvents(java.util.ArrayList<katnote.task.Task> normalTasks, java.util.ArrayList<katnote.task.Task> events) {
    if ((normalTasks.isEmpty()) && (events.isEmpty())) {
        return ;
    }
    java.util.Queue<katnote.task.Task> normalTasksQueue = copyTasksIntoLinkedList(normalTasks);
    java.util.ArrayList<katnote.task.Task> eventCopy = new java.util.ArrayList<katnote.task.Task>(events);
    if (_isGUIFormat) {
        processForToday(normalTasksQueue, eventCopy);
        processForTomorrow(normalTasksQueue, eventCopy);
        processForTheWeek(normalTasksQueue, eventCopy);
        processRemainingTasks(normalTasksQueue, eventCopy);
    }
}