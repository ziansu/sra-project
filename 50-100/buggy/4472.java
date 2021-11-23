public static java.util.Hashtable<java.lang.String, java.lang.Integer> getColumnNamesFromSheet(java.lang.String dataSheet) {
    java.lang.String[] columnNames = common.DataDriver.getDataColumns(dataSheet);
    int numDataColumns = columnNames.length;
    for (int hashIndex = 0; hashIndex < numDataColumns; hashIndex++) {
        common.DataDriver.columnNamesHash.put(columnNames[hashIndex], hashIndex);
    }
    return common.DataDriver.columnNamesHash;
}