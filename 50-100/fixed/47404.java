protected void replaceDistinctWithGroupBy(java.lang.StringBuilder sql) {
    int distinctIndex = sql.indexOf(org.hibernate.dialect.SQLServer2005Dialect.DISTINCT);
    int selectEndIndex = sql.indexOf(org.hibernate.dialect.SQLServer2005Dialect.FROM);
    if ((distinctIndex > 0) && (distinctIndex < selectEndIndex)) {
        sql.delete(distinctIndex, ((distinctIndex + (org.hibernate.dialect.SQLServer2005Dialect.DISTINCT.length())) + 1));
        sql.append(" group by").append(getSelectFieldsWithoutAliases(sql));
    }
}