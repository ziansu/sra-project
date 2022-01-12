private synchronized void scheduleUpdate(org.eclipse.leshan.client.servers.DmServerInfo dmInfo) {
    if (started) {
        long nextUpdate = (dmInfo.lifetime) * 900L;
        org.eclipse.leshan.client.servers.RegistrationEngine.LOG.info("Next registration update in {}s...", (nextUpdate / 1000.0));
        updateFuture = schedExecutor.schedule(new org.eclipse.leshan.client.servers.RegistrationEngine.UpdateRegistrationTask(), nextUpdate, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}