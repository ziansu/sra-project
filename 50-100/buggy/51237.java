@org.junit.Test
public void executeListWithFilterByDeadline() throws java.lang.Exception {
    expectedModel.updateFilteredTaskListToShowPeriod(testDeadline, start, listIncomplete, null);
    teamthree.twodo.logic.commands.ListCommandTest.assertCommandSuccess(listCommandWithDeadline, model, ((ListCommand.MESSAGE_SUCCESS_INCOMPLETE_START) + (testDeadline.getStartDate())), expectedModel);
    expectedModel.updateFilteredListToShowAllIncomplete(null, false);
}