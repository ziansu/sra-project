@java.lang.Override
public seedu.whatnow.logic.commands.CommandResult redo() {
    assert (model) != null;
    try {
        model.addTask(toAdd);
    } catch (seedu.whatnow.model.task.UniqueTaskList.DuplicateTaskException e) {
        return new seedu.whatnow.logic.commands.CommandResult(java.lang.String.format(RedoCommand.MESSAGE_FAIL));
    }
    return new seedu.whatnow.logic.commands.CommandResult(java.lang.String.format(RedoCommand.MESSAGE_SUCCESS));
}