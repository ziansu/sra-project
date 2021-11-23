@org.junit.Test
public void shouldOpenGraphUsingConfiguration() throws java.lang.InterruptedException {
    java.util.Map<java.lang.String, java.lang.Object> map = new java.util.HashMap<java.lang.String, java.lang.Object>();
    map.put(org.janusgraph.graphdb.STORAGE_BACKEND.toStringWithoutRoot(), "inmemory");
    map.put(org.janusgraph.graphdb.configuration.GraphDatabaseConfiguration.GRAPH_NAME.toStringWithoutRoot(), "graph1");
    org.janusgraph.graphdb.JanusConfiguredGraphFactoryTest.configGraphManagement.createConfiguration(new org.apache.commons.configuration.MapConfiguration(map));
    org.janusgraph.graphdb.database.StandardJanusGraph graph = ((org.janusgraph.graphdb.database.StandardJanusGraph) (org.janusgraph.core.JanusConfiguredGraphFactory.open("graph1")));
    assertNotNull(graph);
    org.janusgraph.graphdb.JanusConfiguredGraphFactoryTest.configGraphManagement.removeConfiguration("graph1");
    org.janusgraph.core.JanusConfiguredGraphFactory.close("graph1");
}