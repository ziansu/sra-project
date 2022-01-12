@java.lang.Override
public java.util.Iterator<java.util.List<?>> iterator() {
    return rdcQryExec.query(cctx, qry, keepCacheObj, enforceJoinOrder, timeoutMillis, cancel);
}