public java.util.ArrayList<dooyit.common.datatype.Task> getIncompleteEventTasks() {
    java.util.ArrayList<dooyit.common.datatype.Task> eventTasks = new java.util.ArrayList<dooyit.common.datatype.Task>();
    for (dooyit.common.datatype.Task task : tasks) {
        if ((task.getTaskType()) == (dooyit.common.datatype.Task.TaskType.EVENT)) {
            dooyit.common.datatype.EventTask eventTask = ((dooyit.common.datatype.EventTask) (task));
            if (!(task.isCompleted())) {
                eventTasks.add(task);
            }
        }
    }
    return eventTasks;
}