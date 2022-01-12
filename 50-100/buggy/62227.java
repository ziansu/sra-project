private boolean isANullRow(jxl.Sheet sheet, int rowsNumber) {
    int columns = sheet.getColumns();
    java.lang.String cell;
    for (int j = 0; j <= columns; j++) {
        cell = sheet.getCell(j, rowsNumber).getContents();
        if ((cell == null) || ((cell.length()) == 0)) {
            continue;
        }
        return false;
    }
    return true;
}