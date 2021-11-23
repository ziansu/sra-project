private void setupExecutorJob(org.apache.asterix.active.EntityId entityId, org.apache.hyracks.api.job.JobSpecification channeljobSpec, org.apache.hyracks.api.client.IHyracksClientConnection hcc, org.apache.asterix.bad.metadata.PrecompiledJobEventListener listener, boolean predistributed) throws java.lang.Exception {
    if (channeljobSpec != null) {
        org.apache.hyracks.api.job.JobId jobId = null;
        if (predistributed) {
            jobId = hcc.distributeJob(channeljobSpec);
        }
        java.util.concurrent.ScheduledExecutorService ses = org.apache.asterix.bad.ChannelJobService.startJob(channeljobSpec, java.util.EnumSet.noneOf(org.apache.hyracks.api.job.JobFlag.class), jobId, hcc, org.apache.asterix.bad.ChannelJobService.findPeriod(duration), new java.util.HashMap<>());
        listener.storeDistributedInfo(jobId, ses, null);
    }
}