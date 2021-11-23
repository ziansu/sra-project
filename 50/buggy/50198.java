@java.lang.Override
public seedu.address.logic.commands.CommandResult execute() {
    assert (model) != null;
    model.resetData(seedu.address.model.AddressBook.getEmptyAddressBook());
    return new seedu.address.logic.commands.CommandResult(seedu.address.logic.commands.ClearCommand.MESSAGE_SUCCESS);
}