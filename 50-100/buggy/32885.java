private void createShortestPath(Environment.GraphVertex startVertex, Environment.GraphVertex endVertex) {
    org.jgrapht.alg.BidirectionalDijkstraShortestPath<Environment.GraphVertex, org.jgrapht.graph.DefaultEdge> graphPath = graphMap.getShortestPathBi(graphMap.getGraphCells(), startVertex, endVertex);
    localPath = graphPath.getPath().getVertexList().iterator();
    getNextPosition();
}