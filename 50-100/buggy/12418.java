@java.lang.Override
public void startElement(java.lang.String uri, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
    qName = com.esri.vehiclecommander.Mil2525CMessageParser.translateElementName(qName);
    if (("message".equals(qName)) || ("geomessage".equals(qName))) {
        message = new com.esri.core.symbol.advanced.Message();
        messages.add(message);
        version = attributes.getValue("v");
    }else
        if (MessageHelper.MESSAGE_ID_PROPERTY_NAME.equals(qName)) {
            readingId = true;
        }
    
    elementName = qName;
}