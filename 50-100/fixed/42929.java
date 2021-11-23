@java.lang.Override
public java.util.List<com.yiwugou.homer.core.server.Server> getUpServers() {
    java.util.List<com.netflix.appinfo.InstanceInfo> ins = this.eurekaClient.getInstancesByVipAddress(this.serviceId, false, null);
    java.util.List<com.yiwugou.homer.core.server.Server> servers = new java.util.concurrent.CopyOnWriteArrayList<>();
    for (com.netflix.appinfo.InstanceInfo in : ins) {
        com.yiwugou.homer.core.server.Server server = this.instanceInfoToServer(in);
        servers.add(server);
    }
    servers.removeAll(this.downServers);
    return servers;
}