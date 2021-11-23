@java.lang.Override
public void characters(org.apache.xerces.xni.XMLString text, org.apache.xerces.xni.Augmentations augs) throws org.apache.xerces.xni.XNIException {
    org.xml.sax.ContentHandler ch = getContentHandler();
    try {
        ch.characters(text.ch, text.offset, text.length);
    } catch (org.xml.sax.SAXException e) {
        throw new org.apache.xerces.xni.XNIException(e);
    }
    if ((previous) != null)
        previous.characters(text, augs);
    
}