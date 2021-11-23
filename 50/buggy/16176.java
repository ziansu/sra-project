private org.w3c.dom.Document getSampleSubQueryResultsDoc() throws java.lang.Exception {
    java.io.File rapSheetFile = new java.io.File("src/test/resources/subscriptions/SampleSubscriptionQueryResults.xml");
    java.io.InputStream rapsheetInStream = new java.io.FileInputStream(rapSheetFile);
    javax.xml.parsers.DocumentBuilder docBuilder = getDocBuilder();
    org.w3c.dom.Document rapSheetDoc = docBuilder.parse(rapsheetInStream);
    return rapSheetDoc;
}