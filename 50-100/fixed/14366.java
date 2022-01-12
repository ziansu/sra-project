public void removeCollection(final org.exist.collections.DBBroker broker, final org.exist.xmldb.XmldbURI name) throws org.exist.security.PermissionDeniedException, org.exist.util.LockException {
    if (!(getPermissionsNoLock().validate(broker.getCurrentSubject(), Permission.WRITE))) {
        throw new org.exist.security.PermissionDeniedException(("Permission denied to read collection: " + (path)));
    }
    getLock().acquire(Lock.WRITE_LOCK);
    try {
        subCollections.remove(name);
    } finally {
        getLock().release(Lock.WRITE_LOCK);
    }
}