@java.lang.Override
public boolean addEdge(Graph.Edge e) {
    Graph.Vertex source = e.getSource();
    if (!(adjList.containsKey(source)))
        adjList.put(source, new java.util.ArrayList<>());
    
    adjList.get(source).add(e);
    return true;
}