@java.lang.Override
public java.util.Iterator<java.util.List<?>> iterator() {
    try {
        return rdcQryExec.query(cctx, qry, keepCacheObj, enforceJoinOrder, timeoutMillis, cancel);
    } finally {
        if (cancel != null)
            cancel.setCompleted();
        
    }
}