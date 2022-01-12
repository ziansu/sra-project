@java.lang.Override
public final void close() {
    closeSafe(session);
    try {
        closeInternal();
    } catch (java.lang.Exception ex) {
        org.jeo.sql.Backend.LOG.warn("Error closing Results", ex);
    }
}