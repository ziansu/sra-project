private org.eclipse.rcptt.ecl.data.objects.Table readTable(org.apache.poi.ss.usermodel.Workbook book, int sheetnum) {
    org.eclipse.rcptt.ecl.data.objects.Table table = ObjectsFactory.eINSTANCE.createTable();
    org.apache.poi.ss.usermodel.Sheet sheet = book.getSheetAt(sheetnum);
    org.apache.poi.ss.usermodel.Row headers = sheet.getRow(0);
    if (headers == null) {
        return null;
    }
    table.setPageName(sheet.getSheetName());
    readHeaders(table, headers);
    readRows(table, sheet);
    return table;
}