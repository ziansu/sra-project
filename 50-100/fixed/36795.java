private static void warmUpPartitions(com.hazelcast.core.HazelcastInstance... instances) throws java.lang.InterruptedException {
    for (com.hazelcast.core.HazelcastInstance instance : instances) {
        final com.hazelcast.core.PartitionService ps = instance.getPartitionService();
        for (com.hazelcast.core.Partition partition : ps.getPartitions()) {
            while ((partition.getOwner()) == null) {
                java.lang.Thread.sleep(10);
            } 
        }
    }
}