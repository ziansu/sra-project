private org.w3c.dom.Document getSampleSubQueryResultsDoc(java.lang.String filePath) throws java.lang.Exception {
    java.io.File rapSheetFile = new java.io.File(filePath);
    java.io.InputStream rapsheetInStream = new java.io.FileInputStream(rapSheetFile);
    javax.xml.parsers.DocumentBuilder docBuilder = getDocBuilder();
    org.w3c.dom.Document rapSheetDoc = docBuilder.parse(rapsheetInStream);
    return rapSheetDoc;
}