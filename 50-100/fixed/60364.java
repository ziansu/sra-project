@org.junit.Test
public void testGenerateMapComprehension() {
    java.lang.String query = "using X,Y: from x:X, y:Y reportMap y->x end";
    de.uni_koblenz.jgralab.greql2.evaluator.GreqlEvaluator eval = new de.uni_koblenz.jgralab.greql2.evaluator.GreqlEvaluator(query, null, null);
    eval.createOptimizedSyntaxGraph();
    de.uni_koblenz.jgralab.graphmarker.GraphMarker<de.uni_koblenz.jgralab.greql2.evaluator.vertexeval.VertexEvaluator> graphMarker = eval.getVertexEvaluatorGraphMarker();
    de.uni_koblenz.jgralab.greql2.schema.Greql2 queryGraph = eval.getSyntaxGraph();
}