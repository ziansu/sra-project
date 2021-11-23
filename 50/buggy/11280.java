public void testAffinityBenchmarkAdd() {
    mode = org.apache.ignite.cache.affinity.rendezvous.RendezvousAffinityFunctionSimpleBenchmark.TopologyModificationMode.ADD;
    org.apache.ignite.cache.affinity.AffinityFunction aff0 = new org.apache.ignite.cache.affinity.rendezvous.RendezvousAffinityFunction(true, 1024);
    affinityBenchmark(aff0, new org.apache.ignite.cache.affinity.rendezvous.RendezvousAffinityFunction(true, 1024));
}