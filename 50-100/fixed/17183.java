@org.junit.Test
public void testchrXSetup() throws java.io.IOException, net.lingala.zip4j.exception.ZipException {
    java.lang.String configFolder = "test-data/configs/hapmap-chrX";
    java.lang.String inputFolder = "test-data/data/chrX-unphased";
    java.io.File file = new java.io.File("test-data/tmp");
    if (file.exists()) {
        genepi.io.FileUtil.deleteDirectory(file);
    }
    genepi.imputationserver.util.WorkflowTestContext context = buildContext(inputFolder, "phase1");
    genepi.imputationserver.steps.QCStatisticsTest.QcStatisticsMock qcStats = new genepi.imputationserver.steps.QCStatisticsTest.QcStatisticsMock(configFolder);
    boolean result = run(context, qcStats);
    assertTrue(result);
    genepi.io.FileUtil.deleteDirectory(file);
}