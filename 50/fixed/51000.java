public java.lang.String executeCommand(java.lang.String userCommand) {
    tasknote.shared.COMMAND_TYPE commandType = tasknote.parser.Parser.getCommandType(userCommand, true);
    java.lang.String feedback = tasknote.logic.TaskNoteControl.executeAction(commandType, userCommand);
    return feedback;
}