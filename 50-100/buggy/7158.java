public void parseAdd(java.lang.String command) throws java.lang.Exception {
    CO.setCommandType(parser.Parser.ADD_INDEX);
    parser.CommandParser AP = new parser.AddParser();
    command = command.replaceFirst(Constants.REGEX_ADD, "").trim();
    TO = AP.process(command);
    TO.setTaskId(_taskId);
    CO.setTaskObject(TO);
    setCategory();
    AP.reset();
}