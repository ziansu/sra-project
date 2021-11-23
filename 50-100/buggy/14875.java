void addLookZoneData(org.apache.poi.xssf.usermodel.XSSFSheet sheet, int startIndex, int endIndex) {
    org.apache.poi.ss.usermodel.Row row;
    java.lang.String statName;
    java.lang.Double statValue;
    for (int i = endIndex; i > startIndex; i--) {
        row = sheet.getRow(i);
        org.apache.poi.ss.usermodel.Cell statNameCell = row.getCell(STATISTIC_NAME_CELL);
        statName = statNameCell.getStringCellValue();
        org.apache.poi.ss.usermodel.Cell statValueCell = row.getCell(STATISTIC_VALUE_CELL);
        statValue = statValueCell.getNumericCellValue();
    }
}