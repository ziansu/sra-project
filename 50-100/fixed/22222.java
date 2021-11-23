public static java.lang.String randomNameOwnedBy(com.hazelcast.core.HazelcastInstance instance, java.lang.String prefix) {
    com.hazelcast.core.Cluster cluster = instance.getCluster();
    com.hazelcast.core.Member localMember = cluster.getLocalMember();
    com.hazelcast.core.PartitionService partitionService = instance.getPartitionService();
    for (; ;) {
        java.lang.String id = prefix + (com.hazelcast.test.HazelcastTestSupport.randomString());
        com.hazelcast.core.Partition partition = partitionService.getPartition(id);
        if (com.hazelcast.test.HazelcastTestSupport.comparePartitionOwnership(false, localMember, partition)) {
            return id;
        }
    }
}