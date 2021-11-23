public void startElement(java.lang.String uri, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
    if (qName.equalsIgnoreCase("loc"))
        isLocTag = true;
    
}