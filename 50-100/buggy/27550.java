public static com.hazelcast.core.HazelcastInstance publishService(raspmr.RaspMR.utils.autodiscovery.Service service) {
    com.hazelcast.config.Config config = new com.hazelcast.config.XmlConfigBuilder().build();
    config.getMemberAttributeConfig().setStringAttribute(HazelCastServiceConstants.SERVICE_ATTRIBUTE, service.getServiceType().toString());
    config.getMemberAttributeConfig().setIntAttribute(HazelCastServiceConstants.PORT_ATTRIBUTE, service.getPort());
    config.setProperty("hazelcast.logging.type", "none");
    com.hazelcast.core.HazelcastInstance hz = com.hazelcast.core.Hazelcast.newHazelcastInstance(config);
    return hz;
}