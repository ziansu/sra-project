@java.lang.Override
public seedu.whatnow.logic.commands.CommandResult execute() throws seedu.whatnow.model.task.UniqueTaskList.TaskNotFoundException {
    assert (model) != null;
    if (model.getRedoStack().isEmpty()) {
        return new seedu.whatnow.logic.commands.CommandResult(seedu.whatnow.logic.commands.RedoCommand.MESSAGE_FAIL);
    }else {
        seedu.whatnow.logic.commands.UndoAndRedo reqCommand = ((seedu.whatnow.logic.commands.UndoAndRedo) (model.getRedoStack().pop()));
        java.lang.System.out.println(("undo stack is receiving this in redoCommand : " + reqCommand));
        model.getUndoStack().push(reqCommand);
        return reqCommand.redo();
    }
}