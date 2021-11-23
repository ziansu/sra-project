@java.lang.Override
public java.util.Iterator<org.exist.storage.StoredNode> getNodeIterator(final org.exist.storage.StoredNode node) {
    if (node == null) {
        throw new java.lang.IllegalArgumentException("The node parameter cannot be null.");
    }
    try {
        return new org.exist.storage.dom.NodeIterator(this, domDb, node, false);
    } catch (org.exist.storage.BTreeException | java.io.IOException e) {
        org.exist.storage.LOG.warn("failed to create node iterator", e);
    }
    return null;
}