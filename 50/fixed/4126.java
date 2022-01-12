public org.elasticsearch.cluster.routing.allocation.allocator.BalancedShardsAllocator.RebalanceDecision decideRebalance(final org.elasticsearch.cluster.routing.ShardRouting shard, final org.elasticsearch.cluster.routing.allocation.RoutingAllocation allocation) {
    allocation.debugDecision(true);
    return new org.elasticsearch.cluster.routing.allocation.allocator.BalancedShardsAllocator.Balancer(logger, allocation, weightFunction, threshold).decideRebalance(shard);
}