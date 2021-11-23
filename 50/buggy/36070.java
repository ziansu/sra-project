@org.junit.Test
public void testLinkWeightBody() {
    graph.generateConnectedGraph();
    graph.randomlyAssignEdgeWeights();
    graph.generateLinkWeightBody();
    java.lang.System.out.println(graph.generateLinkWeightBody());
}