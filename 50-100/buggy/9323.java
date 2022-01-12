public main.State executeCommand(java.lang.String commandText, java.lang.String directory) throws java.io.IOException, json.JSONException {
    completeState.clearStatusMessage();
    command.Command userCommand;
    userCommand = parser.parseCommand(commandText);
    if (null == userCommand) {
        completeState.setStatusMessage(State.MESSAGE_PARSE_ERROR);
    }
    userCommand.execute(completeState);
    assert isValidCommand(userCommand);
    storage.stateToStorage(completeState, directory);
    return completeState;
}