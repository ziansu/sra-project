private void parseDropinsFilesVariables(java.io.File file) throws java.lang.Exception {
    org.w3c.dom.Document doc = parseDocument(new java.io.FileInputStream(file));
    parseVariables(doc);
    parseIncludeVariables(doc);
}