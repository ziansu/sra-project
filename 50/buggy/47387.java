@java.lang.Override
public java.lang.Object start() {
    try {
        domDb.flush();
    } catch (final org.exist.storage.DBException e) {
        org.exist.storage.LOG.warn("error while flushing dom.dbx", e);
    }
    return null;
}