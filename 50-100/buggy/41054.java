@java.lang.Override
public java.lang.String undo() throws seedu.tache.logic.commands.exceptions.CommandException {
    try {
        model.addTask(new seedu.tache.model.task.Task(taskToDelete));
        return java.lang.String.format(seedu.tache.logic.commands.DeleteCommand.MESSAGE_DELETE_TASK_SUCCESS, taskToDelete);
    } catch (seedu.tache.model.task.UniqueTaskList.DuplicateTaskException e) {
        throw new seedu.tache.logic.commands.exceptions.CommandException(java.lang.String.format(seedu.tache.logic.commands.DeleteCommand.MESSAGE_DUPLICATE_TASK, taskToDelete));
    }
}