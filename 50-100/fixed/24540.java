public static java.lang.String queryBySQL(final java.lang.Class<?> c, final com.logpie.framework.db.basic.Parameter... params) {
    java.lang.String sql = com.logpie.framework.db.support.SqlUtil.queryAllSQL(c);
    org.springframework.util.Assert.hasLength(sql);
    return (params.length) == 0 ? sql : sql + (com.logpie.framework.db.support.SqlUtil.whereSQL(c, params));
}