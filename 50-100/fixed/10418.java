@org.junit.Test
public void undoAdd() {
    seedu.taskell.logic.commands.UndoCommand.clearCommandHistory();
    seedu.taskell.testutil.TestTask[] currentList = td.getTypicalTasks();
    seedu.taskell.testutil.TestTask taskToAdd = td.holdMeeting;
    commandBox.runCommand(taskToAdd.getAddCommand());
    assertAddSuccess(taskToAdd, currentList);
    currentList = seedu.taskell.testutil.TestUtil.addTasksToList(currentList, taskToAdd);
    commandBox.runCommand("undo 1");
    assertDeleteSuccess(currentList.length, currentList);
    seedu.taskell.logic.commands.UndoCommand.clearCommandHistory();
}