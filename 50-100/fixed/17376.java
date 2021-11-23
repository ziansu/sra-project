private void assertMarkDoneSuccess(int filteredTaskListIndex, int taskBossIndex, seedu.taskboss.testutil.TestTask markedDoneTask) {
    commandBox.runCommand(("done " + filteredTaskListIndex));
    expectedTasksList[(taskBossIndex - 1)] = markedDoneTask;
    org.junit.Assert.assertTrue(taskListPanel.isListMatching(expectedTasksList));
    assertResultMessage(java.lang.String.format(MarkDoneCommand.MESSAGE_MARK_TASK_DONE_SUCCESS, markedDoneTask));
}