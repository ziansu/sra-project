public db.Table getTable(java.lang.String tableName) {
    for (db.Table table : tables)
        if (table.getName().equals(tableName))
            return table;
        
    
    return null;
}