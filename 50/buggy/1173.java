@java.lang.Override
public java.util.List<org.elasticsearch.cluster.node.DiscoveryNode> buildDynamicNodes() {
    if ((cache) == null) {
        cache = new io.crate.azure.discovery.AzureUnicastHostsProvider.DiscoNodeCache(refreshInterval, java.util.Collections.<org.elasticsearch.cluster.node.DiscoveryNode>emptyList());
        cache.refresh();
    }
    return cache.getOrRefresh();
}