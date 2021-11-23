@java.lang.Override
public java.lang.Void doNotify() {
    logger.info("[notifyClusterUpdate]{},{}", dcName, clusterName);
    metaServerConsoleServiceManagerWrapper.get(dcName).clusterModified(clusterName, clusterMetaService.getClusterMeta(dcName, clusterName));
    return null;
}