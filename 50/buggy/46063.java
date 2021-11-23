private fitnesse.testsystems.slim.tables.SlimTable parseDefineAliasTable(fitnesse.testsystems.slim.Table table) {
    for (int rowIndex = 1; rowIndex < (table.getRowCount()); rowIndex++)
        parseDefineAliasRow(table, rowIndex);
    
    return null;
}