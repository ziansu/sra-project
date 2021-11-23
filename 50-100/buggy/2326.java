private net.barik.SpreadsheetAnalyzer.FunctionEvalType getAndConvertCachedType(org.apache.poi.ss.usermodel.Cell cell) {
    if ((cell.getCachedFormulaResultType()) == (org.apache.poi.ss.usermodel.Cell.CELL_TYPE_NUMERIC)) {
        if (org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(cell)) {
            return net.barik.SpreadsheetAnalyzer.FunctionEvalType.DATE;
        }
        double d = cell.getNumericCellValue();
        if ((java.lang.Math.rint(d)) == d) {
            return net.barik.SpreadsheetAnalyzer.FunctionEvalType.INTEGER;
        }else {
            return net.barik.SpreadsheetAnalyzer.FunctionEvalType.NON_INTEGER_NUMBER;
        }
    }else {
        return net.barik.SpreadsheetAnalyzer.FunctionEvalType.fromCellType(cell.getCellType());
    }
}