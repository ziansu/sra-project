private void assertLoad(java.lang.String testTaskManagerFilePath, savvytodo.model.task.ReadOnlyTask[] tasks) {
    java.lang.String cmd = "load " + testTaskManagerFilePath;
    commandBox.runCommand(cmd);
    org.junit.Assert.assertTrue(taskListPanel.isListMatching(tasks));
    assertResultMessage(savvytodo.logic.commands.LoadCommand.getSuccessMessage(testTaskManagerFilePath));
}