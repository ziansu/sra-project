private static void splitFile(java.io.File srcFile, java.io.File dstDir, org.apache.commons.csv.CSVFormat csvFormat, java.lang.String... splitColmumns) throws java.lang.Exception {
    org.endeavourhealth.sftpreader.utilities.CsvSplitter csvSplitter = new org.endeavourhealth.sftpreader.utilities.CsvSplitter(srcFile, dstDir, csvFormat, splitColmumns);
    csvSplitter.go();
}