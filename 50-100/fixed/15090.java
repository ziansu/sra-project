@java.lang.Override
public void endDocument(org.apache.xerces.xni.Augmentations augs) throws org.apache.xerces.xni.XNIException {
    org.xml.sax.ContentHandler ch = getContentHandler();
    if (ch != null) {
        try {
            ch.endDocument();
        } catch (org.xml.sax.SAXException e) {
            throw new org.apache.xerces.xni.XNIException(e);
        }
    }
    if ((previous) != null)
        previous.endDocument(augs);
    
}