@org.junit.Test
public void execute_find_date() throws java.lang.Exception {
    java.util.List<t09b1.today.model.task.Task> expectedList = java.util.Arrays.asList(td.todayListDeadline, td.completedListDeadline, td.completedListEvent);
    assertCommandSuccess("find due today", t09b1.today.logic.commands.Command.getMessageForTaskListShownSummary(expectedList.size()), expectedAB, expectedList);
}