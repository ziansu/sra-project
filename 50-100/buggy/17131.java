public void addXML() {
    assert (input) != null : "Input is null";
    input = dateParser.XMLParser.removeAllTags(input);
    dateParser.CommandParser.COMMAND given = cmdParser.getCommand(input);
    java.lang.System.out.println(("before" + (input)));
    addXMLDate();
    addXMLCmd();
    if ((given != (dateParser.CommandParser.COMMAND.SEARCH)) && (given != (dateParser.CommandParser.COMMAND.SAVEDIR))) {
        addXMLID();
        addXMLTitleDesc();
    }
    addXMLGarbage();
    java.lang.System.out.println(("after" + (input)));
}