public static void objectToJsonFile(java.lang.String outputFilepath, java.lang.Object obj) throws java.io.IOException {
    java.io.File reportFile = new java.io.File(outputFilepath);
    if (((reportFile.getParentFile()) != null) && (!(reportFile.getParentFile().exists()))) {
        reportFile.getParentFile().mkdirs();
    }
    org.gbif.occurrence.cli.common.JsonWriter.OM.writeValue(reportFile, obj);
}