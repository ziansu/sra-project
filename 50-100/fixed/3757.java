private seedu.malitio.logic.parser.Command prepareDelete(java.lang.String args) {
    java.lang.String index = parseIndex(args);
    char taskType = index.charAt(0);
    int taskNum = java.lang.Integer.parseInt(index.substring(1));
    if (index.isEmpty()) {
        return new seedu.malitio.logic.parser.IncorrectCommand(java.lang.String.format(seedu.malitio.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT, DeleteCommand.MESSAGE_USAGE));
    }
    return new seedu.malitio.logic.parser.DeleteCommand(taskType, taskNum);
}