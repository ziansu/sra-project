@java.lang.Override
public final void cancel(final boolean rollback) {
    if ((supportsCancel) && ((stmt) != null)) {
        synchronized(cancelled) {
            cancelled = cancel(stmt, rollback);
            if ((cancelled) && ((logger) != null))
                logger.logDB(LogLevel.INFO, this, "CANCEL", "Query execution successfully stopped!", null);
            
        }
    }
}