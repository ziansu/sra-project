public void parseExcelFile() throws java.text.ParseException {
    try {
        java.io.FileInputStream excelFile = new java.io.FileInputStream(new java.io.File(com.inse.utility.ExcelParser.FILE_NAME));
        com.inse.utility.Workbook workbook = new org.apache.poi.xssf.usermodel.XSSFWorkbook(excelFile);
        com.inse.utility.Sheet backupNurseSheet = workbook.getSheetAt(com.inse.utility.ExcelParser.BACKUP_NURSE_SHEET);
        com.inse.utility.Sheet feasibleVisits = workbook.getSheetAt(com.inse.utility.ExcelParser.VISITS_COST_SHEET);
        parseBackupNurseSheet(backupNurseSheet);
        parseFeasibleVisitSheet(feasibleVisits);
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}