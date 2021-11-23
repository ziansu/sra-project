@java.lang.Override
public java.lang.Object start() {
    try {
        domDb.flush();
    } catch (final org.exist.storage.DBException e) {
        org.exist.storage.LOG.error("error while flushing dom.dbx", e);
    }
    return null;
}