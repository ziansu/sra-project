@java.lang.Override
public void startDocument(org.apache.xerces.xni.XMLLocator locator, java.lang.String encoding, org.apache.xerces.xni.NamespaceContext namespaceContext, org.apache.xerces.xni.Augmentations augs) throws org.apache.xerces.xni.XNIException {
    setLocator(locator);
    if ((previous) != null) {
        previous.startDocument(locator, encoding, namespaceContext, augs);
    }
    org.xml.sax.ContentHandler ch = getContentHandler();
    if (ch != null) {
        try {
            ch.startDocument();
        } catch (org.xml.sax.SAXException e) {
            throw new org.apache.xerces.xni.parser.XMLParseException(locator, "", e);
        }
    }
}