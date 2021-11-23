@java.lang.Override
public void warning(org.xml.sax.SAXParseException ex) throws org.xml.sax.SAXException {
    org.owasp.dependencycheck.xml.suppression.SuppressionErrorHandler.LOGGER.debug("", ex);
}