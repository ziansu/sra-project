protected void dfTraverse(java.lang.String currentVertex, java.util.Set<java.lang.String> visited) {
    visited.add(currentVertex);
    java.util.Iterator<uk.ac.ucl.ucabter.graphs.DirectionalGraph.Edge> edgePointer = vertices.get(currentVertex).iterator();
    while (edgePointer.hasNext()) {
        uk.ac.ucl.ucabter.graphs.DirectionalGraph.Edge current = edgePointer.next();
        if (!(visited.contains(current.terminal)))
            dfTraverse(current.terminal, visited);
        
    } 
}