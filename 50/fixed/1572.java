public final void copyRow(final org.apache.poi.ss.usermodel.Workbook wb, final org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook wbWrapper, final org.apache.poi.ss.usermodel.Sheet srcSheet, final org.apache.poi.ss.usermodel.Sheet destSheet, final int srcRow, final int destRow) {
    copyRows(wb, wbWrapper, srcSheet, destSheet, srcRow, srcRow, destRow, true);
}