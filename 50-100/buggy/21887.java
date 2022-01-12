@java.lang.Override
public java.lang.String buildCollectorFile(edu.cornell.kfs.concur.batch.businessobject.ConcurStandardAccountingExtractFile saeFileContents, edu.cornell.kfs.concur.batch.report.ConcurStandardAccountingExtractBatchReportData reportData) {
    if (saeFileContents == null) {
        throw new java.lang.IllegalArgumentException("saeFileContents cannot be null");
    }else
        if (reportData == null) {
            throw new java.lang.IllegalArgumentException("reportData cannot be null");
        }
    
    org.kuali.kfs.gl.batch.CollectorBatch collectorBatch = buildCollectorBatch(saeFileContents, reportData);
    if (collectorBatch == null) {
        edu.cornell.kfs.concur.batch.service.impl.ConcurStandardAccountingExtractCreateCollectorFileServiceImpl.LOG.error(("buildCollectorFile(): There was a problem preparing the data for the Collector file;" + " will not create a file. See earlier logs for details."));
        return org.apache.commons.lang.StringUtils.EMPTY;
    }
    return writeToCollectorFile(saeFileContents.getOriginalFileName(), collectorBatch, reportData);
}