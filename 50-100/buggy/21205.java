@java.lang.Override
public seedu.inbx0.logic.commands.CommandResult execute() {
    if ((checkDate) == "") {
        model.updateFilteredListToShowAll();
        return new seedu.inbx0.logic.commands.CommandResult(seedu.inbx0.logic.commands.ListCommand.MESSAGE_SUCCESS);
    }else {
        model.updateFilteredTaskList(checkDate, preposition);
        return new seedu.inbx0.logic.commands.CommandResult(getMessageForTaskListShownSummary(model.getFilteredTaskList().size()));
    }
}