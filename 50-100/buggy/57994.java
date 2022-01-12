private void startElementMixin(final org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
    io.inkstand.scribble.rules.jcr.util.XMLContentHandler.LOG.debug("Found mixin declaration");
    try {
        addMixin(nodeStack.peek(), attributes);
    } catch (final javax.jcr.RepositoryException e) {
        throw new org.xml.sax.SAXException("Could not add mixin type", e);
    }
}