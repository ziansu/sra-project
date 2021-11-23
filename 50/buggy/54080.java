@java.lang.Override
public void warning(org.xml.sax.SAXParseException exception) throws org.xml.sax.SAXException {
    org.junit.Assert.fail(("Generated blueprint xml is not well formed " + (exception.getMessage())));
}