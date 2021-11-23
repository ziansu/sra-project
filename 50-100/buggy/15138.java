@java.lang.Override
protected java.util.List<com.weibo.api.motan.rpc.URL> discoverService(com.weibo.api.motan.rpc.URL url) {
    try {
        java.lang.String parentPath = com.weibo.api.motan.registry.zookeeper.ZkUtils.toNodeTypePath(url, ZkNodeType.AVAILABLE_SERVER);
        java.util.List<java.lang.String> currentChilds = new java.util.ArrayList<java.lang.String>();
        if (zkClient.exists(parentPath)) {
            currentChilds = zkClient.getChildren(parentPath);
        }
        return nodeChildsToUrls(parentPath, currentChilds);
    } catch (java.lang.Throwable e) {
        throw new com.weibo.api.motan.exception.MotanFrameworkException(java.lang.String.format("Failed to discover service %s from zookeeper(%s), cause: %s", url, getUrl(), e.getMessage()));
    }
}