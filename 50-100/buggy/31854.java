@java.lang.Override
public void processingInstruction(java.lang.String target, org.apache.xerces.xni.XMLString data, org.apache.xerces.xni.Augmentations augs) throws org.apache.xerces.xni.XNIException {
    if ((previous) != null)
        previous.processingInstruction(target, data, augs);
    
    org.xml.sax.ContentHandler ch = getContentHandler();
    if (ch != null) {
        try {
            ch.processingInstruction(target, data.toString());
        } catch (org.xml.sax.SAXException e) {
            throw new org.apache.xerces.xni.parser.XMLParseException(getLocator(), "", e);
        }
    }
}