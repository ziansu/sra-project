private org.apache.ignite.internal.processors.odbc.SqlListenerConnectionContext prepareContext(byte clientType) {
    switch (clientType) {
        case org.apache.ignite.internal.processors.odbc.SqlListenerNioListener.ODBC_CLIENT :
            return new org.apache.ignite.internal.processors.odbc.odbc.OdbcConnectionContext(ctx, busyLock, maxCursors);
        case org.apache.ignite.internal.processors.odbc.SqlListenerNioListener.JDBC_CLIENT :
            return new org.apache.ignite.internal.processors.odbc.jdbc.JdbcConnectionContext(ctx, busyLock, maxCursors);
        default :
            throw new org.apache.ignite.IgniteException(("Unknown client type: " + clientType));
    }
}