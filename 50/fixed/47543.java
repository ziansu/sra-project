public double getCellAsDouble(java.lang.String cellName) {
    org.apache.poi.ss.excelant.util.Cell cell = getCell(cellName);
    return cell.getNumericCellValue();
}