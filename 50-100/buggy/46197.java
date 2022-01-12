public synchronized org.entrystore.Entry getByEntryURI(java.net.URI entryURI) {
    org.entrystore.Entry entry = cache.getByEntryURI(entryURI);
    if (entry != null) {
        return entry;
    }
    try {
        return getByMMdURIDirect(entryURI);
    } catch (org.openrdf.repository.RepositoryException e) {
        org.entrystore.impl.ContextImpl.log.error(e.getMessage(), e);
    }
    return null;
}