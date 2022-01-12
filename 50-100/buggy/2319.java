@java.lang.Override
public seedu.taskboss.logic.commands.CommandResult execute() throws seedu.taskboss.commons.exceptions.IllegalValueException, seedu.taskboss.logic.commands.exceptions.CommandException {
    assert (model) != null;
    try {
        model.addTask(toAdd);
        scrollToTask();
        model.updateFilteredListToShowAll();
        return new seedu.taskboss.logic.commands.CommandResult(java.lang.String.format(seedu.taskboss.logic.commands.AddCommand.MESSAGE_SUCCESS, toAdd));
    } catch (seedu.taskboss.model.task.UniqueTaskList e) {
        throw new seedu.taskboss.logic.commands.exceptions.CommandException(seedu.taskboss.logic.commands.AddCommand.MESSAGE_DUPLICATE_TASK);
    } catch (java.lang.IllegalArgumentException iae) {
        throw new seedu.taskboss.logic.commands.exceptions.CommandException(seedu.taskboss.model.task.Recurrence.MESSAGE_RECURRENCE_CONSTRAINTS);
    }
}