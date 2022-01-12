@java.lang.Override
public void fatalError(org.xml.sax.SAXParseException exception) {
    log.warn(((webInf.getAbsolutePath()) + " is not valid."), exception);
    isValid = false;
}