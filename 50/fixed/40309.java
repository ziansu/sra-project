@java.lang.Override
public void endElement(java.lang.String uri, java.lang.String localName, java.lang.String qName) throws org.xml.sax.SAXException {
    if (MessageHelper.MESSAGE_ID_PROPERTY_NAME.equals(qName)) {
        readingId = false;
    }
    elementName = null;
}