@java.lang.Override
public com.stratio.deep.jdbc.config.JdbcDeepJobConfig<T> sort(java.lang.String sort) {
    if ((dbTable) != null) {
        this.sort = new com.healthmarketscience.sqlbuilder.dbspec.basic.DbColumn(dbTable, sort, "");
    }
    return this;
}