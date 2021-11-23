private void loadIndividualPropertiesRow(java.util.List<io.konig.spreadsheet.WorkbookLoader.Worker.PathInfo> pathList, org.apache.poi.ss.usermodel.Row row) throws io.konig.spreadsheet.SpreadsheetException {
    org.openrdf.model.URI individualId = uriValue(row, individualIdCol);
    if (individualId != null) {
        io.konig.core.Vertex v = graph.getVertex(individualId);
        owlReasoner.inferTypeOfSuperClass(v);
        for (io.konig.spreadsheet.WorkbookLoader.Worker.PathInfo pathInfo : pathList) {
            org.openrdf.model.Value value = getValue(row, pathInfo);
            if (value != null) {
                assignValue(individualId, pathInfo, value);
            }
        }
    }
}