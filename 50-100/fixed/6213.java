@org.junit.Test
public void generateDataDumpFtpSuccessReportTest() throws java.lang.Exception {
    org.recap.model.jpa.ReportEntity savedReportEntity1 = saveDataDumpSuccessReport();
    java.lang.String generatedReportFileName = dataDumpGenerateReport(savedReportEntity1.getCreatedDate(), "BatchExport", RecapConstants.SUCCESS, savedReportEntity1.getInstitutionName(), RecapConstants.FTP, savedReportEntity1.getFileName());
    org.junit.Assert.assertNotNull(generatedReportFileName);
}