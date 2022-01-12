private command.api.Command createCommand(java.lang.String userCommand) throws java.lang.Exception {
    assert (userCommand != null) && ((parserLogic) != null);
    parser.logic.ParseLogic.COMMAND_TYPE commandType = parserLogic.determineCommandType(userCommand);
    command.api.Command newCommand = parserLogic.createCommand(commandType);
    if (newCommand == null) {
        throw new common.exception.InvalidCommandFormatException("Unable to create command with specified user input");
    }
    addOptions(commandType, newCommand, userCommand);
    addCommandToList(newCommand, commandType);
    return newCommand;
}