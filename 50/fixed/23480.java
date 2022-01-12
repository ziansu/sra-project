@java.lang.Override
public void error(org.xml.sax.SAXParseException exception) throws org.xml.sax.SAXException {
    outWriter.append("Error: ").append(getParseExceptionInfo(exception)).append('\n');
}