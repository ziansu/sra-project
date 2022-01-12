@org.junit.Test
public void edit_findThenEdit_success() throws java.lang.Exception {
    commandBox.runCommand("find Birthday");
    java.lang.String detailsToEdit = "Birthday prepare";
    int filteredTaskListIndex = 1;
    int taskBossIndex = 5;
    seedu.taskboss.testutil.TestTask taskToEdit = expectedTasksList[(taskBossIndex - 1)];
    java.lang.System.out.println(("taskToEdit: " + (taskToEdit.getName().fullName)));
    seedu.taskboss.testutil.TestTask editedTask = new seedu.taskboss.testutil.TaskBuilder(taskToEdit).withName("Birthday prepare").withCategories("Alltasks", "Friends", "Owesmoney").build();
    assertEditSuccess(false, filteredTaskListIndex, taskBossIndex, detailsToEdit, editedTask);
}