public void cancelDexterServerJobs() {
    if ((sendingResultScheduledFuture) != null)
        sendingResultScheduledFuture.cancel(false);
    
    if ((mergingFilterScheduledFuture) != null)
        mergingFilterScheduledFuture.cancel(false);
    
}