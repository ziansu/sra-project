@java.lang.Override
public void endElement(java.lang.String uri, java.lang.String localName, java.lang.String qName) throws org.xml.sax.SAXException {
    if ((stringBuffer) == null)
        xmlHandler.tagEnd(qName);
    else
        xmlHandler.attribute(null, new java.lang.String(stringBuffer));
    
    stringBuffer = null;
}