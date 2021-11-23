public com.orientechnologies.orient.core.db.ODatabaseDocumentInternal poolOpen(java.lang.String name, java.lang.String user, java.lang.String password, com.orientechnologies.orient.core.db.ODatabasePoolInternal pool) {
    final com.orientechnologies.orient.core.db.document.ODatabaseDocumentEmbedded embedded;
    synchronized(this) {
        checkOpen();
        com.orientechnologies.orient.core.storage.impl.local.OAbstractPaginatedStorage storage = getOrInitStorage(name);
        storage.open(pool.getConfig().getConfigurations());
        embedded = factory.newPoolInstance(pool, storage);
    }
    embedded.internalOpen(user, password, pool.getConfig());
    embedded.callOnOpenListeners();
    return embedded;
}