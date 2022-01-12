@org.junit.Before
public void setUp() {
    java.lang.String xmlFileName = "hazelcast-multicast-plugin.xml";
    java.io.InputStream xmlResource = com.hazelcast.spi.discovery.multicast.MulticastDiscoveryStrategy.class.getClassLoader().getResourceAsStream(xmlFileName);
    config = new com.hazelcast.config.XmlConfigBuilder(xmlResource).build();
    java.lang.System.setProperty(TestEnvironment.HAZELCAST_TEST_USE_NETWORK, "true");
    java.lang.System.setProperty("java.net.preferIPv4Stack", "true");
    factory = createHazelcastInstanceFactory(2);
}