@org.junit.Test
public void archive() {
    commandBox.runCommand("archive");
    assertResultMessage(java.lang.String.format(seedu.taskManager.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT, ArchiveCommand.MESSAGE_USAGE));
    commandBox.runCommand("arc");
    assertResultMessage(Messages.MESSAGE_UNKNOWN_COMMAND);
    seedu.address.testutil.TestTask[] currentList = td.getTypicalTasks();
    currentList = seedu.address.testutil.TestUtil.removeTaskFromList(currentList, 1);
    commandBox.runCommand("archive 1");
    org.junit.Assert.assertTrue(taskListPanel.isListMatching(currentList));
}