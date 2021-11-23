@org.junit.Test
public void execute_add_successful() throws java.lang.Exception {
    seedu.typed.logic.LogicManagerTest.TestDataHelper helper = new seedu.typed.logic.LogicManagerTest.TestDataHelper();
    seedu.typed.model.task.Task toBeAdded = helper.adam();
    seedu.typed.model.TaskManager expectedTM = new seedu.typed.model.TaskManager();
    expectedTM.addTask(toBeAdded);
    assertCommandSuccess(helper.generateAddCommand(toBeAdded), java.lang.String.format(AddCommand.MESSAGE_SUCCESS, toBeAdded), expectedTM, expectedTM.getTaskList());
}