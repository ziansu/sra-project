public static java.lang.String[][] collapseVertically(java.lang.String[][] cellValues) {
    for (int i = (cellValues.length) - 1; i > 0; i--) {
        if (!((cellValues[i][0]) == null)) {
            return umm3601.digitalDisplayGarden.ExcelParser.trimArrayVertically(cellValues, i);
        }
    }
    return null;
}