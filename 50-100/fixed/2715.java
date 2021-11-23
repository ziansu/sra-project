protected void assertLoad(java.lang.String testTaskManagerFilePath, savvytodo.model.task.ReadOnlyTask[] tasks) {
    loadFromFilePath(testTaskManagerFilePath);
    savvytodo.testutil.TestUtil.printTasks(taskListPanel.getListView().getItems().toArray(new savvytodo.model.task.Task[0]));
    java.lang.System.out.println();
    savvytodo.testutil.TestUtil.printTasks(tasks);
    org.junit.Assert.assertTrue(taskListPanel.isListMatchingIgnoreOrder(tasks));
    assertResultMessage(savvytodo.logic.commands.LoadCommand.getSuccessMessage(testTaskManagerFilePath));
}