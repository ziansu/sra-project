public main.data.Command parse(java.lang.String commandString) {
    java.lang.String command = getFirstWord(commandString);
    main.data.Command.Type commandType = getCommandType(command);
    main.parser.CommandParser.logger.log(java.util.logging.Level.INFO, (("Starting " + commandType) + " command preparations."));
    return commandPreparations(commandType, commandString);
}