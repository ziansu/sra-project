private seedu.addressbook.commands.Command prepareSort(java.lang.String args) {
    try {
        args = args.replaceAll(" ", "");
        seedu.addressbook.commands.SortCommand.SortType sortType = SortCommand.SortType.valueOf(args.toUpperCase());
        return new seedu.addressbook.commands.SortCommand(sortType);
    } catch (java.lang.IllegalArgumentException | seedu.addressbook.data.exception.IllegalValueException exception) {
        return new seedu.addressbook.commands.IncorrectCommand(java.lang.String.format(seedu.addressbook.common.Messages.MESSAGE_INVALID_COMMAND_FORMAT, SortCommand.MESSAGE_USAGE));
    }
}