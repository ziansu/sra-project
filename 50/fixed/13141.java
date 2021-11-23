public void testDetectMultiLine() throws java.lang.Exception {
    org.datacleaner.util.CsvConfigurationDetection detection = new org.datacleaner.util.CsvConfigurationDetection(new java.io.File("src/test/resources/csv-detect/csv_multi_line.csv"));
    org.apache.metamodel.csv.CsvConfiguration configuration = detection.suggestCsvConfiguration();
    assertTrue(configuration.isMultilineValues());
}