private static void initClusters() {
    com.hazelcast.config.Config config = new com.hazelcast.config.Config();
    config.setLicenseKey(com.hazelcast.examples.helper.LicenseUtils.ENTERPRISE_LICENSE_KEY);
    com.hazelcast.map.wanreplication.EnterpriseMapWanReplicationClusterA.clusterA = com.hazelcast.core.Hazelcast.newHazelcastInstance(config);
}