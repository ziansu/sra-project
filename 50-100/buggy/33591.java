@java.lang.Override
public org.apache.poi.ss.formula.ptg.Ptg[] getFormulaTokens(org.apache.poi.ss.formula.EvaluationCell evalCell) {
    org.apache.poi.xssf.usermodel.XSSFCell cell = ((org.apache.poi.xssf.usermodel.XSSFEvaluationCell) (evalCell)).getXSSFCell();
    org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook frBook = org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook.create(_uBook);
    return org.apache.poi.ss.formula.FormulaParser.parse(cell.getCellFormula(), frBook, FormulaType.CELL, _uBook.getSheetIndex(cell.getSheet()), cell.getRowIndex());
}