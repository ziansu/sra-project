@org.junit.Test
public void unmark_findThenUnmark_success() throws java.lang.Exception {
    commandBox.runCommand("find clean");
    java.lang.String commandType = "marking";
    int filteredTaskListIndex = 1;
    int taskBossIndex = 1;
    seedu.taskboss.testutil.TestTask taskToUnmark = expectedTasksList[(taskBossIndex - 1)];
    seedu.taskboss.testutil.TestTask unmarkedTask = new seedu.taskboss.testutil.TaskBuilder(taskToUnmark).build();
    seedu.taskboss.testutil.TestTask[] resultList = new seedu.taskboss.testutil.TestTask[]{ unmarkedTask };
    assertUnmarkSuccess(commandType, false, filteredTaskListIndex, taskBossIndex, unmarkedTask, resultList);
}