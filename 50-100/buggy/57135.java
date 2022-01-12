@java.lang.Override
public void shutdown() {
    try {
        flush();
        sync(Sync.MAJOR_SYNC);
        domDb.close();
        collectionsDb.close();
        notifyClose();
    } catch (final java.lang.Exception e) {
        org.exist.storage.LOG.warn(e.getMessage(), e);
    }
    super.shutdown();
}