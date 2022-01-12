public org.lenzi.fstore.repository.model.FSNode getNodeWithParentClosure(org.lenzi.fstore.repository.model.FSNode node) throws org.lenzi.fstore.repository.exception.DatabaseException {
    javax.persistence.Query query = null;
    try {
        query = getEntityManager().createQuery(getHqlQueryNodeWithParentClosure());
        query.setParameter("nodeId", node.getNodeId());
    } catch (java.lang.IllegalArgumentException e) {
        throw new org.lenzi.fstore.repository.exception.DatabaseException(("IllegalArgumentException was thrown. " + (e.getMessage())));
    }
    org.lenzi.fstore.repository.model.FSNode nodeWithParentClosure = ((org.lenzi.fstore.repository.model.FSNode) (getSingleResult(query)));
    return nodeWithParentClosure;
}