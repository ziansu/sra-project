private Cmd parseOneWordCmd() {
    COMMAND_TYPE command = OneTagParser.getCommand(input);
    switch (command) {
        case OneTagParser.HOME :
        case OneTagParser.DONE :
        case OneTagParser.TODAY :
        case OneTagParser.UPCOMING :
        case OneTagParser.SOMEDAY :
        case OneTagParser.HELP :
            java.lang.String view = input;
            return new ViewCmd(view);
        case OneTagParser.UNDO :
            return new UndoCmd();
        case OneTagParser.EXIT :
            java.lang.System.exit(0);
        default :
            throw new java.lang.Error("invalid");
    }
}