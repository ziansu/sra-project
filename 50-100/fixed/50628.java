@java.lang.Override
public void initialize() throws org.codehaus.plexus.personality.plexus.lifecycle.phase.InitializationException {
    refreshMeta();
    java.util.concurrent.Executors.newSingleThreadScheduledExecutor(com.ctrip.hermes.core.utils.HermesThreadFactory.create("RefreshMeta", true)).scheduleWithFixedDelay(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            try {
                refreshMeta();
            } catch (java.lang.RuntimeException e) {
                com.ctrip.hermes.meta.service.ServerMetaService.logger.warn(e);
            }
        }
    }, 1, 1, java.util.concurrent.TimeUnit.SECONDS);
}