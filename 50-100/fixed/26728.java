@java.lang.Override
public org.apache.poi.ss.formula.ptg.Ptg[] getFormulaTokens(org.apache.poi.ss.formula.EvaluationCell evalCell) {
    org.apache.poi.xssf.streaming.SXSSFCell cell = ((org.apache.poi.xssf.streaming.SXSSFEvaluationCell) (evalCell)).getSXSSFCell();
    return org.apache.poi.ss.formula.FormulaParser.parse(cell.getCellFormula(), this, FormulaType.CELL, _uBook.getSheetIndex(cell.getSheet()));
}