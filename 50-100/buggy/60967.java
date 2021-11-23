@java.lang.Override
public org.wirez.core.command.CommandResult<V> undo(final T context) {
    final org.wirez.core.command.CommandResult<V> parentUndoResult = commandManager.undo(context);
    if ((!(org.wirez.core.command.CommandUtils.isError(parentUndoResult))) && (!(undoCommands.isEmpty()))) {
        return this.undo(context, undoCommands);
    }
    if (null != (listener)) {
    }
    return parentUndoResult;
}