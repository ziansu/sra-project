private void writeSampleBuffer(java.util.List<de.mvbonline.jmeteranalyzer.frontend.sql.Sample> buffer, java.lang.String threadName) {
    if ((createTables) && ((createdTables.get(threadName)) == null)) {
        sqlImport.createSampleTable(threadName);
        createdTables.put(threadName, true);
    }
    sqlImport.insertSamples(buffer, threadName);
}