public int getColOffset(java.lang.String colName) {
    int result = 0;
    for (int i = 0; i < (columnNames.length); i++) {
        if (columnNames[i].equalsIgnoreCase(colName))
            break;
        else {
            result += getTypeSize(dataTypes[i]);
        }
    }
    return result;
}