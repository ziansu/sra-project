public javax.jcr.Node getContextualizedNode() throws javax.jcr.RepositoryException {
    if (hasProperty(Constants.NODE)) {
        try {
            return getProperty(Constants.NODE).getContextualizedNode();
        } catch (javax.jcr.ItemNotFoundException e) {
            return null;
        }
    }
    return null;
}