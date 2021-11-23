private seedu.addressbook.parser.Command prepareEditAddress(java.lang.String arguments) {
    try {
        final int chosenIndex = parseArgsAsDisplayedIndex(splitBySpace(arguments)[seedu.addressbook.parser.Parser.GET_INDEX]);
        final java.lang.String givenNewAddress = getAddress(splitBySpace(arguments));
        return new seedu.addressbook.parser.EditAddressCommand(chosenIndex, givenNewAddress);
    } catch (seedu.addressbook.parser.Parser.ParseException | java.lang.NumberFormatException e) {
        return new seedu.addressbook.parser.IncorrectCommand(java.lang.String.format(seedu.addressbook.common.Messages.MESSAGE_INVALID_COMMAND_FORMAT, EditAddressCommand.MESSAGE_USAGE));
    } finally {
    }
}