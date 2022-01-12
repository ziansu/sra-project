private void startBatchJob(java.lang.String batchJobName, java.lang.String batchFileName) {
    try {
        batchService.startBatchJobWithDataFile(batchJobName, getClass().getResourceAsStream(("/" + batchFileName)), batchFileName, new java.util.Properties());
        log.info((("**** Started " + batchJobName) + " batch job"));
    } catch (java.lang.Exception e) {
        log.error((("Failed starting " + batchJobName) + " batch job"), e);
    }
}