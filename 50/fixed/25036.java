public db.Table getTable(java.lang.String tableName) {
    tableName = tableName.trim();
    for (db.Table table : tables)
        if (table.getName().equals(tableName))
            return table;
        
    
    return null;
}