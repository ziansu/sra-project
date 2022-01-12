@org.junit.Test
public void termiateTask_findThenTerminate_success() throws java.lang.Exception {
    commandBox.runCommand("find ensure");
    int filteredTaskListIndex = 1;
    int taskBossIndex = 2;
    seedu.taskboss.testutil.TestTask taskToTerminate = expectedTasksList[(taskBossIndex - 1)];
    seedu.taskboss.testutil.TestTask terminatedTask = new seedu.taskboss.testutil.TaskBuilder(taskToMarkDone).withCategories("Done").build();
    seedu.taskboss.testutil.TestTask[] resultList = new seedu.taskboss.testutil.TestTask[]{ markedDoneTask };
    assertTerminateSuccess(false, filteredTaskListIndex, taskBossIndex, terminatedTask, resultList);
}