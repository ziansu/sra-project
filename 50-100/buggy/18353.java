public java.util.List<T> findAll(java.lang.Class<T> t) throws me.nlighten.backend.db.dao.exception.DAOException {
    try {
        javax.persistence.criteria.CriteriaBuilder cb = em.getCriteriaBuilder();
        javax.persistence.criteria.CriteriaQuery<T> cq = cb.createQuery(t);
        javax.persistence.criteria.Root<T> root = cq.from(t);
        javax.persistence.TypedQuery<T> typedQuery = em.createQuery(cq);
        return typedQuery.getResultList();
    } catch (java.lang.Exception e) {
        throw new me.nlighten.backend.db.dao.exception.DAOException(me.nlighten.backend.db.dao.exception.DAOMessageException.COULD_NOT_FIND_ALL_OBJECTS, e);
    }
}