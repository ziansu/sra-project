public com.ibatis.sqlmap.engine.mapping.statement.CacheKey getCacheKey(com.ibatis.sqlmap.engine.scope.StatementScope statementScope, java.lang.Object parameterObject) {
    com.ibatis.sqlmap.engine.mapping.sql.Sql sql = statementScope.getSql();
    com.ibatis.sqlmap.engine.mapping.parameter.ParameterMap pmap = sql.getParameterMap(statementScope, parameterObject);
    com.ibatis.sqlmap.engine.mapping.statement.CacheKey cacheKey = pmap.getCacheKey(statementScope, parameterObject);
    cacheKey.update(id);
    cacheKey.update(sql.getSql(statementScope, parameterObject));
    return cacheKey;
}