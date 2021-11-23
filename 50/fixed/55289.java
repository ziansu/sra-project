private static java.lang.String splitSearchIdAndArgs(java.lang.String commandArgs) {
    try {
        urgenda.parser.Parser.taskIndex = java.lang.Integer.parseInt(urgenda.parser.Parser.getFirstWord(commandArgs));
    } catch (java.lang.Exception e) {
        return commandArgs;
    }
    return urgenda.parser.Parser.removeFirstWord(commandArgs);
}