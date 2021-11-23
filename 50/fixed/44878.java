@java.lang.Override
public void commit() throws java.lang.Exception {
    de.jpaw.bonaparte.jpa.refs.PersistenceProviderJPARLImpl.LOGGER.debug("commit(): transaction end");
    try {
        transaction.commit();
    } finally {
        transaction = null;
    }
}