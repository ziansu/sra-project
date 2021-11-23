private static java.lang.String removeTask(java.lang.String stringID) {
    for (Task.Task t : taskList) {
        if ((t.getTaskId()) == (java.lang.Integer.parseInt(stringID))) {
            java.lang.String removedTask = java.lang.Integer.toString(t.getTaskId());
            taskList.remove(t);
            java.lang.System.out.println((("Task" + removedTask) + "was erased"));
        }
    }
    return Task.TaskHandler.ERROR_NOT_FOUND_TASK;
}