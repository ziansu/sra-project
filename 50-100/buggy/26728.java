@java.lang.Override
public org.apache.poi.ss.formula.ptg.Ptg[] getFormulaTokens(org.apache.poi.ss.formula.EvaluationCell evalCell) {
    org.apache.poi.xssf.streaming.SXSSFCell cell = ((org.apache.poi.xssf.streaming.SXSSFEvaluationCell) (evalCell)).getSXSSFCell();
    org.apache.poi.xssf.streaming.SXSSFEvaluationWorkbook frBook = org.apache.poi.xssf.streaming.SXSSFEvaluationWorkbook.create(_uBook);
    return org.apache.poi.ss.formula.FormulaParser.parse(cell.getCellFormula(), frBook, FormulaType.CELL, _uBook.getSheetIndex(cell.getSheet()));
}