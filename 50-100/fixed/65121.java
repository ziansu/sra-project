public boolean log(org.apache.cassandra.utils.NoSpamLogger.Level l, long nowNanos, java.lang.Object... objects) {
    if (!(shouldLog(nowNanos)))
        return false;
    
    switch (l) {
        case INFO :
            wrapped.info(statement, objects);
            break;
        case WARN :
            wrapped.warn(statement, objects);
            break;
        case ERROR :
            wrapped.error(statement, objects);
            break;
        default :
            throw new java.lang.AssertionError();
    }
    return true;
}