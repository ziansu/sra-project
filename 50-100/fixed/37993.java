private static parser.Command createEditTaskCommand(java.util.List<java.lang.String> commandArgs) {
    for (int i = 1; i < (commandArgs.size()); i++) {
        java.lang.String commandArg = commandArgs.get(i);
        switch (commandArg) {
            case "-name" :
                break;
            case "-start" :
                break;
            case "-end" :
                break;
            default :
                return null;
        }
    }
    return new parser.EditTaskCommand(0, null, null, null);
}