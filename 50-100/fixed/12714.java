@org.junit.Test
public void computeSimpleGraphTest() throws java.lang.Exception {
    algorithms.river_issue.FordFulkerson fordTestGraph = new algorithms.river_issue.FordFulkerson();
    fordTestGraph.init(testGraph);
    fordTestGraph.setSourceAndTarget(testGraph.getNode("S"), testGraph.getNode("T"));
    fordTestGraph.compute();
    org.junit.Assert.assertEquals(cutFromTestGraph.toString(), fordTestGraph.maxFlowMinCut.toString());
}