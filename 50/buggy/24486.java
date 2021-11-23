public static void createHiddenSheet(org.apache.poi.xssf.usermodel.XSSFWorkbook workbook) {
    workbook.createSheet(com.csgeneratedata.excel.validation.CellValidator.HIDDEN_SHEET);
}