public static void DepthFirstSearch_Visit(graph.CapGraph theGraph, java.lang.Integer vertex, java.util.HashSet<java.lang.Integer> visited, java.util.Stack<java.lang.Integer> finished) {
    visited.add(vertex);
    for (java.lang.Integer neighbor : theGraph.getGraph().get(vertex)) {
        if (!(visited.contains(neighbor))) {
            graph.DepthFirstSearch.DepthFirstSearch_Visit(theGraph, vertex, visited, finished);
        }
    }
    finished.push(vertex);
}