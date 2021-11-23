public static java.lang.String getTasks() {
    if (Storage.tasks.isEmpty()) {
        return Constants.MESSAGE_NO_TASKS;
    }
    java.lang.String allTasks = "\n" + (Constants.DISPLAY_TABLE_HEADERS);
    for (Task task : Storage.tasks.values()) {
        allTasks += "\n" + (task.getUserFormat());
    }
    return allTasks;
}