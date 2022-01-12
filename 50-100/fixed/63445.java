private defaultPart.Logic.CommandType parseCommandType(java.lang.String[] commandTypeAndArguments) {
    if ((commandTypeAndArguments.length) == 0) {
        return defaultPart.Logic.CommandType.BLANK;
    }
    java.lang.String commandTypeStr = commandTypeAndArguments[0].toLowerCase();
    for (defaultPart.Logic.CommandType commandType : defaultPart.Logic.CommandType.values()) {
        if (getFirstLetterOfCommandType(commandType).equals(commandTypeStr)) {
            return commandType;
        }
    }
    return defaultPart.Logic.CommandType.ADD;
}