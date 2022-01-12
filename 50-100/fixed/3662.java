public java.lang.String select(java.lang.String table, java.lang.String... columns) {
    if ((columns == null) || ((columns.length) <= 0))
        return select(table);
    
    return (("SELECT " + (cn.dreampie.common.util.Joiner.on(", ").join(columns))) + " FROM ") + table;
}