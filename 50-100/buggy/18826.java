private boolean isEmptyCell(org.apache.poi.ss.usermodel.Cell cell) {
    return ((cell == null) || ((cell.getCellType()) == (org.apache.poi.ss.usermodel.Cell.CELL_TYPE_BLANK))) || (((cell.getCellType()) == (org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING)) && ((cell.getStringCellValue().trim()) == ""));
}