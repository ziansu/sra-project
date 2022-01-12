@java.lang.Override
public void notifyClusterUpdate(final java.lang.String dcName, final java.lang.String clusterName) {
    fixedThreadPool.submit(new com.ctrip.xpipe.redis.console.service.notifier.MetaNotifyTask("notifyClusterUpdate", config.getConsoleNotifyRetryTimes(), new com.ctrip.xpipe.redis.console.service.notifier.MetaNotifyRetryPolicy(config.getConsoleNotifyRetryInterval())) {
        @java.lang.Override
        public void doNotify() {
            logger.info("[notifyClusterUpdate]{},{}", dcName, clusterName);
            metaServerConsoleServiceManagerWrapper.get(dcName).clusterModified(clusterName, clusterMetaService.getClusterMeta(dcName, clusterName));
        }
    });
}