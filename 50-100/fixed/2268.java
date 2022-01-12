private static java.lang.String removeTask(java.lang.String stringID) {
    if (stringID != null) {
        for (Task.Task t : taskList) {
            if ((t.getTaskId()) == (java.lang.Integer.parseInt(stringID))) {
                java.lang.String removedTask = java.lang.Integer.toString(t.getTaskId());
                taskList.remove(t);
                return removedTask + (Task.TaskHandler.MESSAGE_DELETE_TASK);
            }
        }
    }
    return Task.TaskHandler.ERROR_NOT_FOUND_TASK;
}