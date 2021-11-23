@org.junit.Test
public void undoDelete() {
    seedu.taskell.logic.commands.UndoCommand.clearCommandHistory();
    seedu.taskell.testutil.TestTask[] currentList = td.getTypicalTasks();
    seedu.taskell.testutil.TestTask taskToDelete = currentList[0];
    int target = 1;
    commandBox.runCommand(("delete " + target));
    assertDeleteSuccess(target, currentList);
    currentList = seedu.taskell.testutil.TestUtil.removeTaskFromList(currentList, 1);
    commandBox.runCommand("undo 1");
    assertAddSuccess(taskToDelete, currentList);
    seedu.taskell.logic.commands.UndoCommand.clearCommandHistory();
}