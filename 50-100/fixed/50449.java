private void setupDistributedJob(org.apache.asterix.active.EntityId entityId, org.apache.hyracks.api.job.JobSpecification jobSpec, org.apache.hyracks.api.client.IHyracksClientConnection hcc, org.apache.asterix.bad.metadata.PrecompiledJobEventListener listener, org.apache.hyracks.api.dataset.ResultSetId resultSetId, org.apache.hyracks.api.dataset.IHyracksDataset hdc, org.apache.asterix.translator.IStatementExecutor.Stats stats) throws java.lang.Exception {
    org.apache.hyracks.api.job.JobId jobId = hcc.distributeJob(jobSpec);
    listener.storeDistributedInfo(jobId, null, hdc, resultSetId);
}