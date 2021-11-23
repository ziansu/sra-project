private void assertCompleteSuccess(int targetIndexOneIndexed, final seedu.task.testutil.TestTask[] currentList) {
    seedu.task.testutil.TestTask taskToComplete = currentList[(targetIndexOneIndexed - 1)];
    commandBox.runCommand(("complete " + targetIndexOneIndexed));
    org.junit.Assert.assertTrue(((taskListPanel.getTask((targetIndexOneIndexed - 1)).getStatus().isComplete()) == (taskToComplete.isComplete())));
    assertResultMessage(java.lang.String.format(seedu.task.logic.commands.CompleteCommand.MESSAGE_COMPLETE_TASK_SUCCESS, taskToComplete));
}