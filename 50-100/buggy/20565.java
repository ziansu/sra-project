private void assertEditSuccess(int filteredTaskListIndex, int taskManagerIndex, java.lang.String detailsToEdit, seedu.address.testutil.TestTask editedTask) {
    commandBox.runCommand(((("edit " + filteredTaskListIndex) + " ") + detailsToEdit));
    assertResultMessage(java.lang.String.format(EditCommand.MESSAGE_EDIT_TASK_SUCCESS, editedTask));
    guitests.guihandles.TaskCardHandle editedCard = taskListPanel.navigateToTask(editedTask.getName().fullName);
    assertMatching(editedTask, editedCard);
    org.junit.Assert.assertTrue(taskListPanel.isListMatching(expectedTaskList));
}