public static java.lang.String getStringFromExcelCell(org.apache.poi.ss.usermodel.Cell cell) {
    java.lang.String ret = "";
    try {
        if ((org.apache.poi.ss.usermodel.Cell.CELL_TYPE_NUMERIC) == (cell.getCellType())) {
            ret = "" + ((long) (cell.getNumericCellValue()));
        }else {
            ret = cell.toString();
        }
    } catch (java.lang.Exception e) {
    }
    return ret;
}