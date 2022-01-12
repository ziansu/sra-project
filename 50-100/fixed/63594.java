@java.lang.Override
public org.lenzi.fstore.repository.model.DBNode getNode(java.lang.Long nodeId) throws org.lenzi.fstore.repository.exception.DatabaseException {
    javax.persistence.Query query = null;
    try {
        query = org.lenzi.fstore.repository.tree.AbstractTreeRepository.getEntityManager().createQuery(getHqlQueryNodeById());
        query.setParameter("nodeId", nodeId);
    } catch (java.lang.IllegalArgumentException e) {
        throw new org.lenzi.fstore.repository.exception.DatabaseException(("IllegalArgumentException was thrown. " + (e.getMessage())), e);
    }
    return ((org.lenzi.fstore.repository.model.DBNode) (getSingleResult(query)));
}