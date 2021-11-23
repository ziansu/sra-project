@java.lang.Override
public void run(final boolean timeout) throws java.lang.InterruptedException {
    final com.spotify.helios.agent.RetryScheduler retryScheduler = retryIntervalPolicy.newScheduler();
    while (isAlive()) {
        try {
            update();
            return ;
        } catch (java.lang.Exception e) {
            synced = false;
            com.spotify.helios.servicescommon.coordination.PersistentPathChildrenCache.log.warn("update failed: {}", e.getMessage());
            java.lang.Thread.sleep(retryScheduler.nextMillis());
        }
    } 
}