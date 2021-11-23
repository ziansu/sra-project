protected void testOutputCSV(boolean targetIsStream) throws java.lang.Throwable {
    java.lang.String resources = getResourceFolder();
    java.lang.String outputFile = resources + "/out/test_output_csv.csv";
    org.talend.components.filedelimited.runtime.FileDelimitedWriterTestIT.LOGGER.debug(("Test file path: " + outputFile));
    java.lang.String refFile = resources + "/ref_test_output_csv.csv";
    org.talend.components.filedelimited.tfileoutputdelimited.TFileOutputDelimitedProperties properties = createOutputProperties(outputFile, true);
    if (targetIsStream) {
        properties.targetIsStream.setValue(true);
        properties.fileName.setValue(new java.io.FileOutputStream(new java.io.File(outputFile)));
    }
    basicOutputTest(properties, refFile);
}