public void createCell(org.recap.camel.dailyreconciliation.XSSFWorkbook xssfWorkbook, org.recap.camel.dailyreconciliation.XSSFRow row, java.lang.String cellValue, int cellNum) {
    if (org.apache.commons.lang3.StringUtils.isNotBlank(cellValue)) {
        org.recap.camel.dailyreconciliation.XSSFCell cell = row.createCell(cellNum);
        cell.setCellValue(cellValue);
        org.recap.camel.dailyreconciliation.CellStyle cellStyle = xssfWorkbook.createCellStyle();
        cellStyle.setAlignment(HorizontalAlignment.LEFT);
        cell.setCellStyle(cellStyle);
    }
}