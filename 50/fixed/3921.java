@java.lang.Override
public void warning(org.xml.sax.SAXParseException exception) throws org.xml.sax.SAXException {
    outWriter.append("Warning: ").append(getParseExceptionInfo(exception)).append('\n');
}