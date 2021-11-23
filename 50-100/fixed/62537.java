public void restore(org.vibur.dbcp.cache.StatementVal.StatementVal statement, boolean clearWarnings) {
    if ((statement.state()) == null)
        return ;
    
    java.sql.Statement rawStatement = statement.value();
    if (clearWarnings)
        org.vibur.dbcp.util.JdbcUtils.clearWarnings(rawStatement);
    
    if (!(statement.state().compareAndSet(org.vibur.dbcp.cache.IN_USE, org.vibur.dbcp.cache.AVAILABLE)))
        org.vibur.dbcp.util.JdbcUtils.closeStatement(rawStatement);
    
}