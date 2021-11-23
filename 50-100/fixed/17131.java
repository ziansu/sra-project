public void addXML() {
    assert (input) != null : "Input is null";
    input = dateParser.XMLParser.removeAllTags(input);
    dateParser.CommandParser.COMMAND given = cmdParser.getCommand(input);
    addXMLDate();
    addXMLCmd();
    if ((given != (dateParser.CommandParser.COMMAND.SEARCH)) && (given != (dateParser.CommandParser.COMMAND.SAVEDIR))) {
        addXMLID();
        addXMLTitleDesc();
    }
    addXMLGarbage();
}