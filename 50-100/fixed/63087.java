private java.lang.Object fromXLSX(org.apache.poi.ss.usermodel.Cell cell) {
    if (cell == null) {
        return null;
    }
    switch (cell.getCellType()) {
        case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_BLANK :
            return null;
        case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_BOOLEAN :
            return cell.getBooleanCellValue();
        case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_NUMERIC :
            double numericValue = cell.getNumericCellValue();
            return org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(cell) ? org.apache.poi.ss.usermodel.DateUtil.getJavaDate(numericValue) : ((java.lang.Double) (numericValue));
        case org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING :
        default :
            return cell.getStringCellValue();
    }
}