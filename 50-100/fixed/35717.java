public T findById(java.lang.Class<T> t, java.lang.Object id) throws me.nlighten.backend.db.dao.exception.DAOException {
    try {
        return em.find(t, id);
    } catch (javax.persistence.NoResultException nre) {
        return null;
    } catch (java.lang.Exception e) {
        throw new me.nlighten.backend.db.dao.exception.DAOException(e, me.nlighten.backend.db.dao.exception.DAOMessageException.COULD_NOT_FIND_OBJECT_BY_ID);
    }
}