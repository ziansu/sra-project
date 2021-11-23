private seedu.address.logic.parser.Command prepareDelete(java.lang.String args) {
    java.util.Optional<java.lang.Integer> index = parseIndex(args);
    java.lang.String name = args;
    if (!(index.isPresent())) {
        if ((name == null) || (name.equals(""))) {
            return new seedu.address.logic.parser.IncorrectCommand(java.lang.String.format(seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT, DeleteCommand.MESSAGE_USAGE));
        }
        return new seedu.address.logic.parser.DeleteCommand(name, seedu.address.logic.parser.Parser.KEYWORDS_ARGS_FORMAT);
    }
    return new seedu.address.logic.parser.DeleteCommand(index.get());
}