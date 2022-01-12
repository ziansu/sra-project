private javax.jcr.Node newNode(final javax.jcr.Node parent, final org.xml.sax.Attributes attributes) throws javax.jcr.RepositoryException {
    javax.jcr.Node parentNode;
    if (parent == null) {
        parentNode = session.getRootNode();
    }else {
        parentNode = parent;
    }
    final java.lang.String name = attributes.getValue("name");
    final java.lang.String primaryType = attributes.getValue("primaryType");
    io.inkstand.scribble.rules.jcr.util.XMLContentHandler.LOG.info("Node {} adding child node {}(type={})", parentNode.getPath(), name, primaryType);
    return parentNode.addNode(name, primaryType);
}