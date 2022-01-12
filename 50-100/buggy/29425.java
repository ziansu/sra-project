@java.lang.Override
public seedu.whatnow.logic.commands.CommandResult execute() throws seedu.whatnow.model.task.UniqueTaskList.DuplicateTaskException, seedu.whatnow.model.task.UniqueTaskList.TaskNotFoundException {
    assert (model) != null;
    if (model.getUndoStack().isEmpty()) {
        return new seedu.whatnow.logic.commands.CommandResult(seedu.whatnow.logic.commands.UndoCommand.MESSAGE_FAIL);
    }else {
        seedu.whatnow.logic.commands.UndoAndRedo reqCommand = ((seedu.whatnow.logic.commands.UndoAndRedo) (model.getUndoStack().pop()));
        java.lang.System.out.println(("redo stack is getting this in undoCommand: " + reqCommand));
        model.getRedoStack().push(reqCommand);
        return reqCommand.undo();
    }
}