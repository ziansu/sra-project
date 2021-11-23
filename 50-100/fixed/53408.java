@java.lang.Override
protected void parseUnknown(boolean printWarning) throws javax.xml.stream.XMLStreamException {
    if (("remark".equals(parser.getLocalName())) && ((parser.getEventType()) == (javax.xml.stream.XMLStreamConstants.START_ELEMENT))) {
        final java.lang.String text = parser.getElementText();
        if (text.contains("runtime error")) {
            throw new javax.xml.stream.XMLStreamException(text);
        }
    }
    super.parseUnknown(printWarning);
}