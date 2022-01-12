private notify.logic.command.Command handleDeleteCommand(notify.logic.command.Action commandAction, java.util.Stack<notify.logic.command.ReversibleCommand> historyStack, notify.logic.TaskManager taskManager, java.lang.String input) {
    notify.logic.command.Command command = null;
    java.lang.String[] split = input.split(notify.logic.parser.CommandParser.COMMAND_SEPERATOR);
    boolean isNumeric = org.apache.commons.lang3.StringUtils.isNumeric(split[notify.logic.parser.CommandParser.FIRST_PARAM_INDEX]);
    if (isNumeric == false) {
        throw new java.lang.IllegalArgumentException(notify.logic.parser.CommandParser.ERROR_INVALID_PARAMS);
    }
    int id = java.lang.Integer.parseInt(split[notify.logic.parser.CommandParser.FIRST_PARAM_INDEX]);
    command = new notify.logic.command.DeleteCommand(commandAction, id, historyStack, taskManager);
    return command;
}