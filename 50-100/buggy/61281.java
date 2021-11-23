@javax.ejb.TransactionAttribute(value = javax.ejb.TransactionAttributeType.REQUIRED)
public boolean delete(T t) throws me.nlighten.backend.db.dao.exception.DAOException {
    try {
        boolean result = false;
        t = em.merge(t);
        em.remove(t);
        result = true;
        return result;
    } catch (java.lang.Exception e) {
        throw new me.nlighten.backend.db.dao.exception.DAOException(me.nlighten.backend.db.dao.exception.DAOMessageException.OBJECT_COULD_NOT_BE_DELETED, e);
    }
}