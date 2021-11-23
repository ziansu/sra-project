private void endElementProperty() throws org.xml.sax.SAXException {
    io.inkstand.scribble.rules.jcr.util.XMLContentHandler.LOG.debug("Closing property");
    final io.inkstand.schemas.jcr_import.PropertyDescriptor pd = this.propertyStack.pop();
    try {
        pd.setValue(this.parseValue(pd.getJcrType(), this.textStack.pop()));
        this.addProperty(this.nodeStack.peek(), pd);
    } catch (final javax.jcr.RepositoryException e) {
        throw new org.xml.sax.SAXException("Could set property value", e);
    }
}