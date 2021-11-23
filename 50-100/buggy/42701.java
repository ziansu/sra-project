public void startElement(java.lang.String uri, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
    if (qName == "page") {
        pageName = null;
        text = null;
        ns = null;
    }else
        if (((qName == "title") || (qName == "text")) || (qName == "ns")) {
            curCharValue = new java.lang.StringBuffer(1024);
        }
    
}