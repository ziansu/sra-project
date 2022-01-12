@java.lang.Override
public seedu.whatnow.logic.commands.CommandResult execute() {
    assert (model) != null;
    if (model.getUndoStack().isEmpty()) {
        return new seedu.whatnow.logic.commands.CommandResult(seedu.whatnow.logic.commands.UndoCommand.MESSAGE_FAIL);
    }else {
        if (model.getUndoStack().isEmpty()) {
            return new seedu.whatnow.logic.commands.CommandResult(seedu.whatnow.logic.commands.UndoCommand.MESSAGE_FAIL);
        }
        seedu.whatnow.logic.commands.UndoAndRedo reqCommand = ((seedu.whatnow.logic.commands.UndoAndRedo) (model.getUndoStack().pop()));
        model.getRedoStack().push(reqCommand);
        return reqCommand.undo();
    }
}