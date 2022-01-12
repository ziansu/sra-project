@javax.ejb.TransactionAttribute(value = javax.ejb.TransactionAttributeType.REQUIRED)
public T merge(T t) throws me.nlighten.backend.db.dao.exception.DAOException {
    try {
        T result = null;
        result = em.merge(t);
        em.flush();
        return result;
    } catch (java.lang.Exception e) {
        throw new me.nlighten.backend.db.dao.exception.DAOException(e, me.nlighten.backend.db.dao.exception.DAOMessageException.OBJECT_COULD_NOT_BE_MERGED);
    }
}