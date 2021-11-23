@org.junit.Test
public void generateDataDumpFtpSuccessReportTest() throws java.lang.Exception {
    org.recap.model.jpa.ReportEntity savedReportEntity1 = saveDataDumpSuccessReport();
    java.lang.String generatedReportFileName = dataDumpGenerateReport(savedReportEntity1.getCreatedDate(), "BatchExport", RecapConstants.SUCCESS, savedReportEntity1.getInstitutionName(), RecapConstants.FTP, savedReportEntity1.getFileName());
    org.junit.Assert.assertNotNull(generatedReportFileName);
    java.io.File directory = new java.io.File(reportDirectory);
    org.junit.Assert.assertTrue(directory.isDirectory());
    boolean directoryContains = new java.io.File(directory, generatedReportFileName).exists();
    org.junit.Assert.assertTrue(directoryContains);
}