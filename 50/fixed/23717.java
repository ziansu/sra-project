@javax.ejb.TransactionAttribute(value = javax.ejb.TransactionAttributeType.REQUIRED)
public T save(T t) throws me.nlighten.backend.db.dao.exception.DAOException {
    try {
        em.persist(t);
        em.flush();
        return t;
    } catch (java.lang.Exception e) {
        throw new me.nlighten.backend.db.dao.exception.DAOException(e, me.nlighten.backend.db.dao.exception.DAOMessageException.OBJECT_COULD_NOT_BE_SAVED);
    }
}