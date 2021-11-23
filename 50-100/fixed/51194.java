public void startDocument(org.apache.xerces.xni.XMLLocator locator, java.lang.String enc, org.apache.xerces.xni.NamespaceContext nc, org.apache.xerces.xni.Augmentations aug) throws org.apache.xerces.xni.XNIException {
    this.locator = locator;
    context = nc;
    baseSystemId = locator.getBaseSystemId();
    detecting = true;
    schema = null;
    type = null;
    if ((documentHandler) != null) {
        documentHandler.startDocument(locator, enc, nc, aug);
    }
}