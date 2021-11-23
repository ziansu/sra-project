private void getNeighbors(alg.a03.Node v) {
    addToVisited(v);
    java.util.Collection<alg.a03.Vertex> neighbors = graph.getNeighbours(v.getVertex());
    java.util.Iterator<alg.a03.Vertex> nIt = neighbors.iterator();
    while (nIt.hasNext()) {
        alg.a03.Node nextVertex = new alg.a03.Node(nIt.next(), v.getVertex(), ((v.dist) + 1));
        if (!(isVisited(nextVertex))) {
            queue.add(nextVertex);
        }
    } 
}