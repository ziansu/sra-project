public void start() {
    org.genepattern.server.executor.awsbatch.AWSBatchJobRunner.log.debug(("started JobRunner, classname=" + (this.getClass())));
    org.genepattern.server.executor.awsbatch.AWSBatchJobRunner.batchToGPStatusMap.put("SUBMITTED", DrmJobState.QUEUED);
    org.genepattern.server.executor.awsbatch.AWSBatchJobRunner.batchToGPStatusMap.put("PENDING", DrmJobState.QUEUED);
    org.genepattern.server.executor.awsbatch.AWSBatchJobRunner.batchToGPStatusMap.put("RUNNABLE", DrmJobState.QUEUED);
    org.genepattern.server.executor.awsbatch.AWSBatchJobRunner.batchToGPStatusMap.put("STARTING", DrmJobState.RUNNING);
    org.genepattern.server.executor.awsbatch.AWSBatchJobRunner.batchToGPStatusMap.put("RUNNING", DrmJobState.RUNNING);
    org.genepattern.server.executor.awsbatch.AWSBatchJobRunner.batchToGPStatusMap.put("FAILED", DrmJobState.FAILED);
    org.genepattern.server.executor.awsbatch.AWSBatchJobRunner.batchToGPStatusMap.put("SUCCEEDED", DrmJobState.DONE);
}