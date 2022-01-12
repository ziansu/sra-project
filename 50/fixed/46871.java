@java.lang.Override
public void fatalError(org.xml.sax.SAXParseException exception) throws org.xml.sax.SAXException {
    java.lang.String message = "Fatal Error: " + (getParseExceptionInfo(exception));
    outWriter.append(message).append('\n');
    throw new org.xml.sax.SAXException(message);
}