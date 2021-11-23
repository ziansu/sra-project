public void attribute(java.lang.String namespaceURI, java.lang.String localName, java.lang.String qName, java.lang.String value) {
    if (namespaceURI == (javax.xml.XMLConstants.XMLNS_ATTRIBUTE_NS_URI)) {
        if (localName == (javax.xml.XMLConstants.XMLNS_ATTRIBUTE)) {
            localName = "";
        }
        this.startPrefixMapping(localName, value);
    }else {
        attributes.addAttribute(namespaceURI, localName, qName, Constants.CDATA, value);
    }
}