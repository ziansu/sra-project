@java.lang.Override
public boolean addEdge(Graph.Edge e) {
    Graph.Vertex source = e.getSource();
    Graph.Vertex dest = e.getDestination();
    if (!(adjList.containsKey(source)))
        adjList.put(source, new java.util.ArrayList<Graph.Edge>());
    
    adjList.get(source).add(e);
    return true;
}