@java.lang.Override
public seedu.taskboss.logic.commands.CommandResult execute() {
    assert (model) != null;
    try {
        model.redoTaskboss();
        model.updateFilteredListToShowAll();
        return new seedu.taskboss.logic.commands.CommandResult(seedu.taskboss.logic.commands.RedoCommand.MESSAGE_SUCCESS);
    } catch (java.util.EmptyStackException ese) {
        return new seedu.taskboss.logic.commands.CommandResult(seedu.taskboss.logic.commands.RedoCommand.MESSAGE_WITHOUT_PREVIOUS_OPERATION);
    } catch (seedu.taskboss.commons.exceptions.IllegalValueException e) {
        return new seedu.taskboss.logic.commands.CommandResult(e.getMessage());
    }
}