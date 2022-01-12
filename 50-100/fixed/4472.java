public static java.util.HashMap<java.lang.String, java.lang.Integer> getColumnNamesFromSheet(java.lang.String dataSheet) {
    common.DataDriver.columnNamesHash = new java.util.HashMap<java.lang.String, java.lang.Integer>();
    java.lang.String[] columnNames = common.DataDriver.getDataColumns(dataSheet);
    int numDataColumns = columnNames.length;
    for (int hashIndex = 0; hashIndex < numDataColumns; hashIndex++) {
        common.DataDriver.columnNamesHash.put(columnNames[hashIndex], hashIndex);
    }
    return common.DataDriver.columnNamesHash;
}