private void assertUndoCommandSuccess(seedu.address.testutil.TestTask[] expectedList) {
    commandBox.runCommand("undo");
    org.junit.Assert.assertTrue(taskListPanel.isListMatching(expectedList));
    assertResultMessage(UndoCommand.MESSAGE_SUCCESS);
}