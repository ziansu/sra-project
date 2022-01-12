public <T extends SQL.SQLRow> SQL.LazyList<T> lazyAllWhere(java.lang.String where) {
    if (tableExists()) {
        java.lang.String tablename = this.tableName();
        SQL.LazyList items = new SQL.LazyList<T>(dataBaseName(), tablename, where, this.getClass());
        return items;
    }else {
        return new SQL.LazyList<T>();
    }
}