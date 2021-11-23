utilities.hexEdit.HexEditDocumentFilter loadDataCommon(int sourceSize) {
    changes.clear();
    setUpScrollBar();
    currentLineStart = 0;
    prepareDoc(doc, ((long) (sourceSize)));
    fillPane();
    calcHexMetrics(sourceSize);
    setNavigationFilter(doc);
    utilities.hexEdit.HexEditDocumentFilter hexDocumentFilter = setDocumentFilter(doc);
    return hexDocumentFilter;
}