@java.lang.Override
public java.util.List<graph.Graph> getSCCs() {
    java.util.Stack<java.lang.Integer> vertices = getVertices();
    java.util.Stack<java.lang.Integer> finished = graph.DepthFirstSearch.DepthFirstSearch(this, vertices);
    graph.CapGraph transposeGraph = getTransposeGraph();
    return findSCC(transposeGraph, finished);
}