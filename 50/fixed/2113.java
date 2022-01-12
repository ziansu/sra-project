private void startElementProperty(final org.xml.sax.Attributes attributes) {
    io.inkstand.scribble.rules.jcr.util.XMLContentHandler.LOG.debug("Found property");
    this.propertyStack.push(this.newPropertyDescriptor(attributes));
}