private static void closeConnectionBetween(com.hazelcast.core.HazelcastInstance h1, com.hazelcast.core.HazelcastInstance h2) {
    if ((h1 == null) || (h2 == null)) {
        return ;
    }
    com.hazelcast.instance.Node n1 = com.hazelcast.examples.splitbrain.AbstractCacheSplitBrainSample.getNode(h1);
    com.hazelcast.instance.Node n2 = com.hazelcast.examples.splitbrain.AbstractCacheSplitBrainSample.getNode(h2);
    if ((n1 != null) && (n2 != null)) {
        n1.clusterService.removeAddress(n2.address, null);
        n2.clusterService.removeAddress(n1.address, null);
    }
}