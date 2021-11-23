public void addXML() {
    assert (input) != null : "Input is null";
    input = dateParser.XMLParser.removeAllTags(input);
    java.lang.System.out.println(input);
    addXMLDate();
    addXMLID();
    addXMLCmd();
    addXMLTitleDesc();
    addXMLGarbage();
    java.lang.System.out.println(input);
}