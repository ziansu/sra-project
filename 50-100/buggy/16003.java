public static java.lang.Boolean schemaMatch(java.util.Set<java.lang.String> tableCols, java.lang.String sheetHeader, java.lang.String cellSplitor) {
    java.lang.String[] fields = sheetHeader.split(cellSplitor);
    if ((fields.length) != (tableCols.size())) {
        return false;
    }
    for (java.lang.String current : fields) {
        if (!(tableCols.contains(current))) {
            return false;
        }
    }
    return true;
}