@java.lang.Override
public org.neo4j.consistency.checking.full.QueueDistribution.QueueDistributor<org.neo4j.kernel.impl.store.record.RelationshipRecord> distributor(long recordsPerCpu, int numberOfThreads) {
    return new org.neo4j.consistency.checking.full.QueueDistribution.RelationshipNodesQueueDistributor(recordsPerCpu);
}