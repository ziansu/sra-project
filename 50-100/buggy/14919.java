@java.lang.Override
public void endElement(org.apache.xerces.xni.QName element, org.apache.xerces.xni.Augmentations augs) throws org.apache.xerces.xni.XNIException {
    if ((previous) != null)
        previous.endElement(element, augs);
    
    org.xml.sax.ContentHandler ch = getContentHandler();
    if (ch != null) {
        try {
            ch.endElement(notNull(element.uri), element.localpart, prefixed(element));
        } catch (org.xml.sax.SAXException e) {
            throw new org.apache.xerces.xni.parser.XMLParseException(getLocator(), "", e);
        }
    }
}