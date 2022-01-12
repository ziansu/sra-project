public void createBigGraph() {
    if ((_knotenAnzahl) >= 0)
        return ;
    
    _graph = new materialien.Graph.UndirectedAttributedWeightedGraph<materialien.Vertex, materialien.MyWeightedEdge>(materialien.MyWeightedEdge.class);
    _vertexList = new java.util.LinkedList<materialien.Vertex>();
    _vertexMap = new java.util.HashMap<materialien.Vertex, java.lang.Integer>();
    createVertex();
    setRandomValues(_knotenAnzahl);
    calculateHeuristic();
    addVertices();
    addEdges(_kantenAnzahl);
}