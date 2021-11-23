@java.lang.Override
public void doNotify() {
    logger.info("[notifyUpstreamChanged]{},{},{},{},{}", clusterName, shardName, ip, port, dc.getDcName());
    metaServerConsoleServiceManagerWrapper.get(dc.getDcName()).upstreamChange(clusterName, shardName, ip, port);
}