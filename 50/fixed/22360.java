public javax.jcr.Node getContextualizedNode() throws javax.jcr.RepositoryException {
    if (hasProperty(Constants.NODE)) {
        return getProperty(Constants.NODE).getContextualizedNode();
    }
    return null;
}