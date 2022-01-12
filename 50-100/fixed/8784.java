private void assertAddSuccess(seedu.tasklist.testutil.TestTask personToAdd, seedu.tasklist.testutil.TestTask... currentList) {
    commandBox.runCommand(personToAdd.getAddCommand());
    guitests.guihandles.PersonCardHandle addedCard = taskListPanel.navigateToPerson(personToAdd.getTaskDetails().toString());
    assertMatching(personToAdd, addedCard);
    seedu.tasklist.testutil.TestTask[] expectedList = seedu.tasklist.testutil.TestUtil.addTasksToList(currentList, personToAdd);
    org.junit.Assert.assertTrue(taskListPanel.isListMatching(expectedList));
}