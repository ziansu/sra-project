private void assertAdd(savvytodo.testutil.TestTask[] currentList) {
    savvytodo.testutil.TestTask taskToAdd = td.getTypicalTasks()[0];
    commandBox.runCommand(taskToAdd.getAddCommand());
    savvytodo.testutil.TestTask[] expectedList = savvytodo.testutil.TestUtil.addTasksToList(currentList, taskToAdd);
    org.junit.Assert.assertTrue(taskListPanel.isListMatching(expectedList));
}