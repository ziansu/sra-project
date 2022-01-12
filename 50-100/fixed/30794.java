private void undoLastCommand(defaultPart.CommandInfo commandInfo) {
    defaultPart.CommandInfo prevCommandInfo = _storage.undoLastCommand(commandInfo);
    if (prevCommandInfo == null) {
        commandInfo.setFeedback("No more UNDO possible");
    }else {
        commandInfo.setFeedback(java.lang.String.format(defaultPart.Logic.MESSAGE_UNDO, getFirstLetterOfCommandType(prevCommandInfo.getCommandType()), prevCommandInfo.getArguments()));
    }
}