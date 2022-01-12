@java.lang.Override
public void endDocument() throws org.xml.sax.SAXException {
    io.inkstand.scribble.rules.jcr.util.XMLContentHandler.LOG.info("Content Processing finished, saving...");
    try {
        session.save();
    } catch (final javax.jcr.RepositoryException e) {
        throw new org.xml.sax.SAXException("Saving failed", e);
    }
    final long endTime = java.lang.System.nanoTime();
    final long processingTime = endTime - (startTime);
    io.inkstand.scribble.rules.jcr.util.XMLContentHandler.LOG.info("Content imported in {} ms", (processingTime / 1000000));
    io.inkstand.scribble.rules.jcr.util.XMLContentHandler.LOG.info("END ContentImport");
}