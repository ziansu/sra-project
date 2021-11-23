public db.Table addTable(java.lang.String tableName, java.lang.String[] colClauseList) {
    db.Table newTable = new db.Table(tableName, colClauseList);
    tables.add(newTable);
    return newTable;
}