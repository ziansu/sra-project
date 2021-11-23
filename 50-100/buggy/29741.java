@org.junit.Test
public void testEvaluateBlank() throws java.io.IOException {
    org.apache.poi.ss.usermodel.Workbook wb = _testDataProvider.createWorkbook();
    org.apache.poi.ss.usermodel.FormulaEvaluator fe = wb.getCreationHelper().createFormulaEvaluator();
    org.junit.Assert.assertNull(fe.evaluate(null));
    org.apache.poi.ss.usermodel.Sheet sheet = wb.createSheet("Sheet1");
    org.apache.poi.ss.usermodel.Cell cell = sheet.createRow(0).createCell(0);
    org.junit.Assert.assertNull(fe.evaluate(cell));
    wb.close();
}