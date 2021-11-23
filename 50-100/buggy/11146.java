@java.lang.Override
void startElement(java.lang.String uri, java.lang.String localName, java.lang.String qName, int attributePointer, int attributeCount) throws org.xml.sax.SAXException {
    if (((depth)++) > 0) {
        super.startElement(uri, localName, qName, attributePointer, attributeCount);
    }
}