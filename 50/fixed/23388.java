public void close() {
    this.m_db.close();
    org.eclipse.moquette.spi.persistence.MapDBPersistentStore.LOG.debug("closed disk storage");
}