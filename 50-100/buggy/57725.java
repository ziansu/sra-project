@java.lang.Override
public void startElement(org.apache.xerces.xni.QName element, org.apache.xerces.xni.XMLAttributes attributes, org.apache.xerces.xni.Augmentations augs) throws org.apache.xerces.xni.XNIException {
    if ((previous) != null)
        previous.startElement(element, attributes, augs);
    
    org.xml.sax.ContentHandler ch = getContentHandler();
    if (ch != null) {
        try {
            ch.startElement(notNull(element.uri), element.localpart, prefixed(element), saxAttributes(attributes));
        } catch (org.xml.sax.SAXException e) {
            throw new org.apache.xerces.xni.parser.XMLParseException(getLocator(), "", e);
        }
    }
}