@org.junit.Test
public void testDoubleChaining() {
    org.corpus_tools.salt.graph.Graph<org.corpus_tools.salt.graph.Node, org.corpus_tools.salt.graph.Relation<org.corpus_tools.salt.graph.Node, org.corpus_tools.salt.graph.Node>, org.corpus_tools.salt.graph.Layer<org.corpus_tools.salt.graph.Node, org.corpus_tools.salt.graph.Relation<org.corpus_tools.salt.graph.Node, org.corpus_tools.salt.graph.Node>>> graph = createGraph();
    getFixture().setGraph(graph);
    org.junit.Assert.assertTrue(("only contains " + (graph.getLayers())), graph.getLayers().contains(getFixture()));
}