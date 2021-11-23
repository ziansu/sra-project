protected nl.fountain.xelem.excel.Workbook getWorkBookFromInputStream(java.io.InputStream in) throws org.bimserver.plugins.deserializers.DeserializeException {
    java.io.File cachedInput = null;
    nl.fountain.xelem.excel.Workbook cobieWorkBook = null;
    try {
        cobieWorkBook = spreadsheetMLWorkbookFromInputSource(new org.xml.sax.InputSource(in));
    } catch (java.io.IOException | org.xml.sax.SAXException | javax.xml.parsers.ParserConfigurationException e) {
        try {
            java.io.InputStream alternateInput = new java.io.FileInputStream(cachedInput);
            java.io.InputStream spreadsheetML = getWorkbookInputStreamFromXLSXInputStream(alternateInput);
            cobieWorkBook = spreadsheetMLWorkbookFromInputSource(new org.xml.sax.InputSource(spreadsheetML));
        } catch (java.lang.Exception e1) {
            e1.printStackTrace();
            throw new org.bimserver.plugins.deserializers.DeserializeException(e1);
        }
    }
    return cobieWorkBook;
}