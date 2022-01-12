public void startElement(java.lang.String uri, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes atts) throws org.xml.sax.SAXException {
    captureElements = ((depth) == 0) || (((depth) == 1) && (jaxbReader.elementChecker.isParentInfoElement(uri, localName)));
    if (captureElements)
        tmp.startElement(uri, localName, qName, atts);
    
    (depth)++;
}