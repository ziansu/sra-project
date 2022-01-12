public void update(org.apache.poi.xssf.usermodel.XSSFWorkbook workbook) {
    updateGeneral(workbook);
    updateDomains(workbook);
    updateLifecycle(workbook);
    updateMigrations(workbook);
    updateInvestments(workbook);
    store();
}