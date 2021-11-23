java.lang.String parseNumericOrStr(org.apache.poi.ss.usermodel.Row row, int columnIndex) {
    org.apache.poi.ss.usermodel.Cell cell = row.getCell(columnIndex);
    if (cell == null) {
        return null;
    }
    int type = cell.getCellType();
    java.lang.String val = null;
    if (type == (org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING)) {
        val = cell.getStringCellValue();
    }else
        if (type == (org.apache.poi.ss.usermodel.Cell.CELL_TYPE_NUMERIC)) {
            double d = cell.getNumericCellValue();
            val = new java.math.BigDecimal(d).toString();
        }
    
    return val;
}