@java.lang.Override
public seedu.whatnow.logic.commands.CommandResult redo() {
    if (model.getStackOfListTypesRedo().isEmpty()) {
        return new seedu.whatnow.logic.commands.CommandResult(java.lang.String.format(RedoCommand.MESSAGE_FAIL));
    }
    seedu.whatnow.model.task.ReadOnlyTask taskToDelete = model.getDeletedStackOfTasksRedo().pop();
    model.getDeletedStackOfTasks().push(taskToDelete);
    try {
        model.deleteTask(((seedu.whatnow.model.task.Task) (taskToDelete)));
    } catch (seedu.whatnow.model.task.UniqueTaskList.TaskNotFoundException e) {
        return new seedu.whatnow.logic.commands.CommandResult(java.lang.String.format(RedoCommand.MESSAGE_FAIL));
    }
    return new seedu.whatnow.logic.commands.CommandResult(java.lang.String.format(RedoCommand.MESSAGE_SUCCESS));
}