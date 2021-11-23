public void doTestsReport() {
    for (final java.util.Map.Entry<java.lang.String, java.io.File> entry : myTestsTrsFiles.entrySet()) {
        parseTrsTestResults(entry.getKey(), entry.getValue());
    }
    for (final java.io.File file : myTestsXmlFiles) {
        parseXmlTestResults(file);
    }
}