@org.junit.Test
public void testGetCollector() {
    com.youama.nexus.parser.collector.ICollector linkCollector = com.youama.nexus.parser.collector.FactoryCollector.getCollector(FactoryCollector.TYPE_LINK);
    assertTrue((linkCollector instanceof com.youama.nexus.parser.collector.LinkCollector));
    linkCollector.setSource("a");
    assertEquals("a", linkCollector.getSource());
    linkCollector.getSource();
}