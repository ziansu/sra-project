public java.lang.Class<? extends fitnesse.testsystems.slim.tables.SlimTable> getTableType(java.lang.String tableType) {
    if (hasColon(tableType)) {
        tableType = tableType.substring(0, ((tableType.indexOf(':')) + 1));
    }
    return tableTypes.get(tableType.toLowerCase());
}