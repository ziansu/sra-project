private static javax.jcr.Item getSubitem(javax.jcr.Node node, java.lang.String relPath) throws javax.jcr.RepositoryException {
    if (node.hasNode(relPath)) {
        return node.getNode(relPath);
    }else
        if (node.hasProperty(relPath)) {
            return node.getProperty(relPath);
        }else {
            return null;
        }
    
}