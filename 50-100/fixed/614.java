@org.junit.Test
public void edit_findThenEdit_success() throws java.lang.Exception {
    commandBox.runCommand("find midterm");
    java.lang.String detailsToEdit = "Belle";
    int filteredTaskListIndex = 1;
    int taskManagerIndex = 1;
    seedu.address.testutil.TestTask taskToEdit = expectedTaskList[(taskManagerIndex - 1)];
    seedu.address.testutil.TestTask editedTask = new seedu.address.testutil.TaskBuilder(taskToEdit).withName("Belle").withPriority("m").build();
    assertEditSuccess(filteredTaskListIndex, taskManagerIndex, detailsToEdit, editedTask);
}