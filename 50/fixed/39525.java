public void publish(final javax.jcr.Node node) throws javax.jcr.RepositoryException {
    if (node != null) {
        publish(node.getIdentifier());
    }
}