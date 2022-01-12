private static java.util.Date calculateRowTime() {
    java.util.Date createSheetDate = ExcelPackage.SheetWorker.getCreateSheetDate();
    long longDate = createSheetDate.getTime();
    longDate = longDate - (((((ExcelPackage.RowWorker.currentRow.getRowNum()) - 3) * 1000) * 60) * 60);
    return new java.util.Date(longDate);
}