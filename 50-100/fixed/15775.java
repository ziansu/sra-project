@org.junit.Test
public void testLimitPathSetSize() {
    result = kShortestPathsSearch.search(graph, org.onlab.graph.A, org.onlab.graph.E, weigher, 3);
    org.junit.Assert.assertEquals("There are an unexpected number of paths.", 3, result.paths().size());
    result = kShortestPathsSearch.search(graph, org.onlab.graph.A, org.onlab.graph.G, weigher, 1);
    org.junit.Assert.assertEquals("There are an unexpected number of paths.", 1, result.paths().size());
}