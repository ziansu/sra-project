@java.lang.Override
public void onLocalNodeInitialized(org.apache.ignite.cluster.ClusterNode locNode) {
    for (org.apache.ignite.lang.IgniteInClosure<org.apache.ignite.cluster.ClusterNode> lsnr : locNodeInitLsnrs)
        lsnr.apply(locNode);
    
    if (locNode instanceof org.apache.ignite.spi.discovery.tcp.internal.TcpDiscoveryNode) {
        final org.apache.ignite.spi.discovery.tcp.internal.TcpDiscoveryNode node = ((org.apache.ignite.spi.discovery.tcp.internal.TcpDiscoveryNode) (locNode));
        node.setConsistentId(consistentId);
    }
}