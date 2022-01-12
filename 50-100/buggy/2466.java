protected void dfTraverse(java.lang.String currentVertex, java.util.Map<java.lang.String, java.lang.Boolean> visited) {
    visited.put(currentVertex, true);
    java.util.Iterator<uk.ac.ucl.ucabter.graphs.DirectionalGraph.Edge> edgePointer = vertices.get(currentVertex).iterator();
    while (edgePointer.hasNext()) {
        uk.ac.ucl.ucabter.graphs.DirectionalGraph.Edge current = edgePointer.next();
        if ((visited.get(current.terminal)) == null)
            dfTraverse(current.terminal, visited);
        
    } 
}