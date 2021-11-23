private static java.lang.String[][] parseSheet(com.ontotext.ehri.tools.Sheet sheet) {
    int numColumns = com.ontotext.ehri.tools.ExcelReader.numColumns(sheet);
    java.lang.String[][] rows = new java.lang.String[(sheet.getLastRowNum()) + 1][];
    for (int i = 0; i < (rows.length); i++)
        rows[i] = com.ontotext.ehri.tools.ExcelReader.parseRow(sheet.getRow(i), numColumns);
    
    return rows;
}