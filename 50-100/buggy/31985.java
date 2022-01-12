@java.lang.Override
public void ignorableWhitespace(org.apache.xerces.xni.XMLString text, org.apache.xerces.xni.Augmentations augs) throws org.apache.xerces.xni.XNIException {
    if ((previous) != null)
        previous.ignorableWhitespace(text, augs);
    
    org.xml.sax.ContentHandler ch = getContentHandler();
    if (ch != null) {
        try {
            ch.ignorableWhitespace(text.ch, text.offset, text.length);
        } catch (org.xml.sax.SAXException e) {
            throw new org.apache.xerces.xni.parser.XMLParseException(getLocator(), "", e);
        }
    }
}