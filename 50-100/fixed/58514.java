@org.junit.Test
public void testAddToSameParent() {
    final com.blackducksoftware.integration.hub.bdio.graph.MutableDependencyGraph graph = new com.blackducksoftware.integration.hub.bdio.graph.MutableMapDependencyGraph();
    graph.addParentWithChildren(parent1, child1);
    graph.addParentWithChildren(parent1, child2);
    graph.addChildrenToRoot(parent1);
    com.blackducksoftware.integration.hub.bdio.utility.DependencyGraphTestUtil.assertGraphChildren(graph, parent1, child1, child2);
    com.blackducksoftware.integration.hub.bdio.utility.DependencyGraphTestUtil.assertGraphRootChildren(graph, parent1);
}