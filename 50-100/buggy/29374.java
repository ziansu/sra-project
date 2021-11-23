public seedu.address.logic.commands.CommandResult execute(java.lang.String message) throws seedu.address.logic.commands.exceptions.CommandException {
    assert (model) != null;
    try {
        model.addTask(toAdd);
        this.isSuccess = true;
        int taskIndex = model.getFilteredTaskList().indexOf(toAdd);
        seedu.address.commons.core.EventsCenter.getInstance().post(new seedu.address.commons.events.ui.JumpToTaskListRequestEvent(taskIndex));
        return new seedu.address.logic.commands.CommandResult(seedu.address.logic.commands.CommandFormatter.undoFormatter(message, seedu.address.logic.commands.AddCommand.COMMAND_ADD));
    } catch (seedu.address.model.task.UniqueTaskList e) {
        this.isSuccess = false;
        throw new seedu.address.logic.commands.exceptions.CommandException(seedu.address.logic.commands.AddCommand.MESSAGE_DUPLICATE_TASK);
    }
}