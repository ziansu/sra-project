private org.apache.activemq.artemis.core.persistence.StorageManager createStorageManager() {
    if (configuration.isPersistenceEnabled()) {
        if (((configuration.getStoreConfiguration()) != null) && ((configuration.getStoreConfiguration().getStoreType()) == (StoreConfiguration.StoreType.DATABASE))) {
            return new org.apache.activemq.artemis.core.persistence.impl.journal.JDBCJournalStorageManager(configuration, getScheduledPool(), executorFactory, ioExecutorFactory, shutdownOnCriticalIO);
        }else {
            return new org.apache.activemq.artemis.core.persistence.impl.journal.JournalStorageManager(configuration, executorFactory, scheduledPool, ioExecutorFactory, shutdownOnCriticalIO);
        }
    }
    return new org.apache.activemq.artemis.core.persistence.impl.nullpm.NullStorageManager();
}