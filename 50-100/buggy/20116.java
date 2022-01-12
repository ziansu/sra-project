public java.lang.String allConflictingTasks(seedu.taskmanager.model.task.Task toAdd) {
    java.lang.StringBuilder conflictingTasksStringBuilder = new java.lang.StringBuilder(seedu.taskmanager.logic.commands.AddCommand.EMPTY_STRING);
    for (seedu.taskmanager.model.task.ReadOnlyTask task : model.getTaskManager().getTaskList()) {
        java.lang.System.out.println(task.getAsText());
        if (seedu.taskmanager.logic.parser.DateTimeUtil.isConflicting(toAdd, task)) {
            conflictingTasksStringBuilder.append(task.getAsText());
            conflictingTasksStringBuilder.append(seedu.taskmanager.logic.commands.AddCommand.NEWLINE_STRING);
        }
    }
    return conflictingTasksStringBuilder.toString();
}