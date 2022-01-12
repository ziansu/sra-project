public static java.lang.String getTasks() {
    if (Storage.tasks.isEmpty()) {
        return Constants.MESSAGE_NO_TASKS;
    }
    java.lang.String allTasks = ("\n" + (Constants.DISPLAY_TABLE_HEADERS)) + "\n";
    for (Task task : Storage.tasks.values()) {
        allTasks += (task.getUserFormat()) + "\n";
    }
    return allTasks;
}