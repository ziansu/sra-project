public static java.lang.Boolean schemaMatch(java.util.Set<java.lang.String> tableCols, java.lang.String sheetHeader, java.lang.String cellSplitor) {
    java.lang.String[] fields = sheetHeader.split(cellSplitor);
    for (java.lang.String field : fields) {
        if (!(tableCols.contains(field))) {
            return false;
        }
    }
    return true;
}