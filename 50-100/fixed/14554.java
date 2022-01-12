@org.junit.Test
public void testAlias() {
    final com.blackducksoftware.integration.hub.bdio.graph.builder.LazyExternalIdDependencyGraphBuilder builder = new com.blackducksoftware.integration.hub.bdio.graph.builder.LazyExternalIdDependencyGraphBuilder();
    builder.addChildToRoot(aliasId);
    builder.setDependencyInfo(stringId, "test1", "test2", stringDep.externalId);
    builder.setDependencyAsAlias(aliasId, stringId);
    final com.blackducksoftware.integration.hub.bdio.graph.DependencyGraph graph = builder.build();
    final com.blackducksoftware.integration.hub.bdio.model.dependency.Dependency dep = graph.getDependency(stringDep.externalId);
    org.junit.Assert.assertEquals("test1", dep.name);
    org.junit.Assert.assertEquals("test2", dep.version);
    com.blackducksoftware.integration.hub.bdio.utility.DependencyGraphTestUtil.assertGraphRootChildren(graph, stringDep);
}