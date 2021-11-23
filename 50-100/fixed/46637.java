@org.junit.Test
public void redo_backupFileDeleted_fail() {
    commandBox.runCommand(ClearCommand.COMMAND_WORD_1);
    commandBox.runCommand(UndoCommand.COMMAND_WORD_1);
    java.io.File backup = new java.io.File(history.getRedoFilePath());
    backup.delete();
    commandBox.runCommand(RedoCommand.COMMAND_WORD_1);
    assertResultMessage(RedoCommand.MESSAGE_FAIL_NOT_FOUND);
}