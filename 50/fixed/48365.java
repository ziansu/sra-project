public boolean isMutating() {
    return ((this) instanceof seedu.addressbook.commands.AddCommand) || ((this) instanceof seedu.addressbook.commands.DeleteCommand);
}