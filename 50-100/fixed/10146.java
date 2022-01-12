public void startElement(java.lang.String uri, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes atts) throws org.xml.sax.SAXException {
    if ((depth) == 1)
        captureElements = jaxbReader.elementChecker.isParentInfoElement(uri, localName);
    
    if (captureElements)
        tmp.startElement(uri, localName, qName, atts);
    
    (depth)++;
}