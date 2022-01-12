@java.lang.Override
public void startElement(java.lang.String uri, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
    if (qName.equalsIgnoreCase("positional")) {
        isPositional = true;
    }else
        if (qName.equalsIgnoreCase("named")) {
            isPositional = false;
        }else {
        }
    
}