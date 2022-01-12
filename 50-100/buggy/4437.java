public org.lenzi.fstore.repository.model.DBNode getNodeWithParentClosure(org.lenzi.fstore.repository.model.DBNode node) throws org.lenzi.fstore.repository.exception.DatabaseException {
    javax.persistence.Query query = null;
    try {
        query = org.lenzi.fstore.repository.tree.AbstractTreeRepository.getEntityManager().createQuery(getHqlQueryNodeWithParentClosure());
        query.setParameter("nodeId", node.getNodeId());
    } catch (java.lang.IllegalArgumentException e) {
        throw new org.lenzi.fstore.repository.exception.DatabaseException(("IllegalArgumentException was thrown. " + (e.getMessage())));
    }
    org.lenzi.fstore.repository.model.DBNode nodeWithParentClosure = ((org.lenzi.fstore.repository.model.DBNode) (getSingleResult(query)));
    return nodeWithParentClosure;
}