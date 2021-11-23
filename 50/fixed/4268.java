@java.lang.Override
public org.teamstbf.yats.logic.commands.CommandResult execute() throws org.teamstbf.yats.logic.commands.exceptions.CommandException {
    assert (model) != null;
    model.saveImageOfCurrentTaskManager();
    model.addEvent(toAdd);
    return new org.teamstbf.yats.logic.commands.CommandResult(java.lang.String.format(org.teamstbf.yats.logic.commands.AddCommand.MESSAGE_SUCCESS, toAdd));
}