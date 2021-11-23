public void setGraph(org.jgrapht.UndirectedGraph<com.badlogic.gdx.math.Vector2, org.jgrapht.graph.DefaultEdge> g) {
    this.graph = g;
    currentNode = computeNearest();
}