@org.junit.Test
public void testPathsFromSink() {
    for (org.onlab.graph.TestVertex vertex : vertexes()) {
        org.junit.Assert.assertTrue("There should be no paths from vertex H to any other node.", ((kShortestPathsSearch.search(graph, org.onlab.graph.H, vertex, weigher, 1).paths().size()) == 0));
    }
}