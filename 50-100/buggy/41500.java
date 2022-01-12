public void setCellValue(java.lang.String value) {
    ensureTypeOrFormulaType(org.apache.poi.xssf.streaming.CELL_TYPE_STRING);
    if ((value.length()) > (SpreadsheetVersion.EXCEL2007.getMaxTextLength())) {
        throw new java.lang.IllegalArgumentException("The maximum length of cell contents (text) is 32,767 characters");
    }
    if ((_value.getType()) == (CELL_TYPE_FORMULA))
        ((org.apache.poi.xssf.streaming.SXSSFCell.StringFormulaValue) (_value)).setPreEvaluatedValue(value);
    else
        ((org.apache.poi.xssf.streaming.SXSSFCell.PlainStringValue) (_value)).setValue(value);
    
}