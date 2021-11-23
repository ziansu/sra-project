private void assertAdd(savvytodo.testutil.TestTask[] currentList) {
    savvytodo.testutil.TestTask taskToAdd = td.getTypicalTasks()[0];
    savvytodo.testutil.TestTask[] expectedList = savvytodo.testutil.TestUtil.addTasksToList(currentList, taskToAdd);
    commandBox.runCommand(taskToAdd.getAddCommand());
    org.junit.Assert.assertTrue(taskListPanel.isListMatching(expectedList));
}