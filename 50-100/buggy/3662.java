public java.lang.String select(java.lang.String table, java.lang.String... columns) {
    if ((columns == null) || ((columns.length) <= 0))
        return select(table);
    
    java.lang.String queryColumns;
    if ((columns.length) == 1) {
        queryColumns = columns[0];
    }else {
        queryColumns = cn.dreampie.common.util.Joiner.on(", ").join(columns);
    }
    return (("SELECT " + queryColumns) + " FROM ") + table;
}