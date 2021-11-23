@java.lang.Override
public org.apache.ibatis.mapping.BoundSql getBoundSql(java.lang.Object parameterObject) {
    org.apache.ibatis.mapping.BoundSql boundSql = newBoundSql(config, origMs, parameterObject);
    boundSql.setAdditionalParameter(DaoConstant.V_SQL_OFFSET, rowBounds.getOffset());
    boundSql.setAdditionalParameter(DaoConstant.V_SQL_LIMIT, getLimit(rowBounds));
    return boundSql;
}