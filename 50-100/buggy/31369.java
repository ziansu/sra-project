private void startElementRootNode(final org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
    io.inkstand.scribble.rules.jcr.util.XMLContentHandler.LOG.debug("Found rootNode");
    try {
        nodeStack.push(newNode(null, attributes));
    } catch (final javax.jcr.RepositoryException e) {
        throw new org.xml.sax.SAXException("Could not create node", e);
    }
}