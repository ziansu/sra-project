@java.lang.Override
public org.wirez.core.command.CommandResult<V> undo(final T context) {
    org.wirez.core.command.CommandResult<V> result = null;
    if (undoCommands.isEmpty()) {
        result = commandManager.undo(context);
        if (null != (listener)) {
        }
    }else {
        result = this.undo(context, undoCommands);
    }
    return result;
}