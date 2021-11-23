@java.lang.Override
public void close() {
    if ((transaction) != null) {
        de.jpaw.bonaparte.jpa.refs.PersistenceProviderJPARLImpl.LOGGER.warn("attempt to close an open transaction, performing an implicit rollback");
        transaction.rollback();
    }
    de.jpaw.bonaparte.jpa.refs.PersistenceProviderJPARLImpl.LOGGER.debug("close(): destroying EntityManager");
    if ((entityManager) != null) {
        entityManager.close();
        entityManager = null;
    }
}