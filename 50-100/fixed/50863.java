public void testGenerateListenableUndirectedGraph() {
    java.util.List<org.jgrapht.generate.Graph<java.lang.Integer, org.jgrapht.generate.DefaultEdge>> graphArray = new java.util.ArrayList<>();
    for (int i = 0; i < 3; ++i) {
        graphArray.add(new org.jgrapht.generate.ListenableUndirectedGraph(org.jgrapht.generate.DefaultEdge.class));
    }
    org.jgrapht.generate.RandomGraphGeneratorTest.generateGraphs(graphArray, 11, 50);
    assertTrue(new org.jgrapht.generate.RandomGraphGeneratorTest.EdgeTopologyCompare<java.lang.Integer, org.jgrapht.generate.DefaultEdge>().compare(graphArray.get(0), graphArray.get(1)));
}