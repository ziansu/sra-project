@java.lang.Override
public void rollback() {
    de.jpaw.bonaparte.jpa.refs.PersistenceProviderJPARLImpl.LOGGER.debug("rollback(): terminating transaction");
    try {
        transaction.rollback();
    } finally {
        transaction = null;
    }
}