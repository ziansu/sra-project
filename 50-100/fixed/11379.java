public final org.exist.security.Permission getPermissions() {
    try {
        getLock().acquire(Lock.READ_LOCK);
        return permissions;
    } catch (final org.exist.util.LockException e) {
        org.exist.collections.Collection.LOG.error(e.getMessage(), e);
        return permissions;
    } finally {
        getLock().release(Lock.READ_LOCK);
    }
}