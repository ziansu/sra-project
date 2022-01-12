@org.junit.Test
public void testLinkWeightBody() {
    graph.generateConnectedGraph();
    graph.generateLinkWeightBody();
    java.lang.System.out.println(graph.generateLinkWeightBody());
}