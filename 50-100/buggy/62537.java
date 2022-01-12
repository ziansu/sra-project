public void restore(org.vibur.dbcp.cache.StatementVal.StatementVal statement, boolean clearWarnings) {
    java.sql.Statement rawStatement = statement.value();
    if ((statement.state()) != null) {
        if (clearWarnings)
            org.vibur.dbcp.util.JdbcUtils.clearWarnings(rawStatement);
        
        if (!(statement.state().compareAndSet(org.vibur.dbcp.cache.IN_USE, org.vibur.dbcp.cache.AVAILABLE)))
            org.vibur.dbcp.util.JdbcUtils.closeStatement(rawStatement);
        
    }else
        org.vibur.dbcp.util.JdbcUtils.closeStatement(rawStatement);
    
}