@org.junit.Test
public void unmark_invalidTaskIndex_failure() {
    commandBox.runCommand(("unmark " + (expectedTasksList.length)));
    assertResultMessage(seedu.todoapp.commons.core.Messages.MESSAGE_INVALID_TASK_DISPLAYED_INDEX);
}