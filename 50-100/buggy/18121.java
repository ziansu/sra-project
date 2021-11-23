public synchronized void initTable(com.argo.sqlite.SqliteMapper mapper) {
    java.lang.String tableName = mapper.getTableName();
    final java.util.Map<java.lang.String, java.lang.Boolean> columns = this.getTableColumns(tableName);
    if ((columns == null) || ((columns.size()) == 0)) {
        java.lang.String sql = mapper.getTableCreateSql();
        this.createTable(sql);
    }else {
        this.alterTable(tableName, mapper.getColumnInfo(), columns.keySet());
    }
}