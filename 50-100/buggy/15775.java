@org.junit.Test
public void testLimitPathSetSize() {
    result = kShortestPathsSearch.search(graph, org.onlab.graph.A, org.onlab.graph.E, weigher, 3);
    org.junit.Assert.assertTrue("There are an unexpected number of paths.", ((result.paths().size()) == 3));
    result = kShortestPathsSearch.search(graph, org.onlab.graph.A, org.onlab.graph.G, weigher, 1);
    org.junit.Assert.assertTrue("There are an unexpected number of paths.", ((result.paths().size()) == 1));
}