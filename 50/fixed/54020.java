public java.lang.String getCellAsString(java.lang.String cellName) {
    org.apache.poi.ss.excelant.util.Cell cell = getCell(cellName);
    return cell.getStringCellValue();
}