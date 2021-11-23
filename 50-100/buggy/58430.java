private void assertEditTaskSuccess(seedu.jimi.testutil.TestFloatingTask[] currentList, seedu.jimi.testutil.TestFloatingTask expectedTask, int targetIndex) throws seedu.jimi.commons.exceptions.IllegalValueException {
    commandBox.runCommand((("edit " + targetIndex) + " Get rich or die coding"));
    assertTrue(taskListPanel.isListMatching(expectedTask));
    assertResultMessage(java.lang.String.format(seedu.jimi.logic.commands.DeleteCommand.MESSAGE_DELETE_TASK_SUCCESS, expectedTask));
}