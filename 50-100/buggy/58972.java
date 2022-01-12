public seedu.taskboss.logic.commands.Command parse(java.lang.String args) throws seedu.taskboss.commons.exceptions.IllegalValueException {
    java.util.Optional<java.lang.String> sortTypeOp = seedu.taskboss.logic.parser.ParserUtil.parseSortType(args);
    if (!(sortTypeOp.isPresent())) {
        return new seedu.taskboss.logic.commands.IncorrectCommand(java.lang.String.format(seedu.taskboss.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT, SortCommand.MESSAGE_USAGE));
    }
    java.lang.String sortType = sortTypeOp.get();
    switch (sortType) {
        case seedu.taskboss.logic.parser.SortCommandParser.SORT_PARAM_START_DATE_TIME :
            return new seedu.taskboss.logic.commands.SortCommand(seedu.taskboss.model.task.UniqueTaskList.SortBy.START_DATE_TIME);
        case seedu.taskboss.logic.parser.SortCommandParser.SORT_PARAM_END_DATE_TIME :
            return new seedu.taskboss.logic.commands.SortCommand(seedu.taskboss.model.task.UniqueTaskList.SortBy.END_DATE_TIME);
        default :
            throw new seedu.taskboss.commons.exceptions.IllegalValueException(seedu.taskboss.logic.commands.SortCommand.ERROR_INVALID_SORT_TYPE);
    }
}