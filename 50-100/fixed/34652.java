private void run() throws io.konig.spreadsheet.SpreadsheetException {
    java.util.List<io.konig.spreadsheet.WorkbookLoader.SheetInfo> list = collectSheetInfo();
    java.util.Collections.sort(list);
    for (io.konig.spreadsheet.WorkbookLoader.SheetInfo info : list) {
        loadSheet(info);
    }
    buildRollUpShapes();
    loadIndividualProperties();
    emitProvenance();
    inferPropertyDefinitions();
    loadShapes();
    produceEnumShapes();
    processShapeTemplates();
    visitShapes();
}