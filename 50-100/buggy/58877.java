public seedu.address.logic.commands.OpenCommand parse(java.lang.String args) throws seedu.address.logic.parser.exceptions.ParseException {
    java.lang.String trimmedArgs = args.trim();
    trimmedArgs.replace("\\", "/");
    if ((trimmedArgs.isEmpty()) || (!(trimmedArgs.matches(seedu.address.logic.parser.OpenCommandParser.FILEPATH_REGEX)))) {
        throw new seedu.address.logic.parser.exceptions.ParseException(java.lang.String.format(seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT, OpenCommand.MESSAGE_USAGE));
    }
    return new seedu.address.logic.commands.OpenCommand(trimmedArgs);
}