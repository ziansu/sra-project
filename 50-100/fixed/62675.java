private static java.util.Date calculateRowTime() {
    java.util.Date createSheetDate = ExcelPackage.SheetWorker.getCreateSheetDate();
    long longDate = createSheetDate.getTime();
    longDate = longDate - ((((3 - (ExcelPackage.RowWorker.currentRow.getRowNum())) * 1000) * 60) * 60);
    java.lang.System.out.println(new java.util.Date(longDate));
    return new java.util.Date(longDate);
}