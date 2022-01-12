@org.junit.Test
public void evaluateInCellReturnsSameCell() throws java.io.IOException {
    try (org.apache.poi.ss.usermodel.Workbook wb = _testDataProvider.createWorkbook()) {
        wb.createSheet().createRow(0).createCell(0);
        org.apache.poi.ss.usermodel.FormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator();
        org.apache.poi.ss.usermodel.Cell cell = wb.getSheetAt(0).getRow(0).getCell(0);
        org.apache.poi.ss.usermodel.Cell same = evaluator.evaluateInCell(cell);
        org.junit.Assert.assertSame(cell, same);
    }
}