private void writeMap(java.lang.Object k, java.lang.Object v) {
    org.apache.poi.ss.usermodel.Cell firstCell = sheet.getRow(2).createCell(((cellnum) + (mapCellNum)));
    firstCell.setCellValue(((java.lang.String) (k)));
    cell = row.createCell(((cellnum) + (mapCellNum)));
    cell.setCellValue(((java.lang.String) (v)));
    cell.setCellStyle(style);
    (mapCellNum)++;
}