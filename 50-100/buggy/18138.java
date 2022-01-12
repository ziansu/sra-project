public void controlColWidth(acmr.excel.pojo.ExcelSheet excelSheet, com.acmr.excel.model.ColWidth colWidth) {
    acmr.util.ListHashMap<acmr.excel.pojo.ExcelColumn> colList = ((acmr.util.ListHashMap<acmr.excel.pojo.ExcelColumn>) (excelSheet.getCols()));
    int colIndex = colWidth.getCol();
    int offsetWidth = colWidth.getOffset();
    colList.get(colIndex).setWidth(((colList.get(colIndex).getWidth()) + offsetWidth));
}