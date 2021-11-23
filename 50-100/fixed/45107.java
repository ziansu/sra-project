private java.lang.String getStringValueFromCell(org.apache.poi.xssf.usermodel.XSSFCell cell) {
    if (null == cell) {
        return "0";
    }
    if ((cell.getCellType()) == (org.apache.poi.ss.usermodel.Cell.CELL_TYPE_NUMERIC)) {
        return "" + (cell.getNumericCellValue());
    }else
        if ((cell.getCellType()) == (org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING)) {
            return cell.getStringCellValue();
        }else
            if ((cell.getCellType()) == (org.apache.poi.ss.usermodel.Cell.CELL_TYPE_BLANK)) {
                return "0";
            }else {
                return "0";
            }
        
    
}