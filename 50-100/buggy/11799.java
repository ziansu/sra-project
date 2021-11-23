@java.lang.Override
public void characters(final char[] chr, final int start, final int length) throws org.xml.sax.SAXException {
    final java.lang.String text = new java.lang.String(chr).substring(start, (start + length));
    io.inkstand.scribble.rules.jcr.util.XMLContentHandler.LOG.trace("characters; '{}'", text);
    final java.lang.String trimmedText = text.trim();
    if (!(trimmedText.isEmpty())) {
        io.inkstand.scribble.rules.jcr.util.XMLContentHandler.LOG.info("text: '{}'", trimmedText);
        this.textStack.push(trimmedText);
    }
}