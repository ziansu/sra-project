public static void main(java.lang.String[] args) {
    Graphs.Graph G = new Graphs.Graph(6);
    G.addEdge(1, 3);
    G.addEdge(0, 2);
    G.addEdge(1, 5);
    G.addEdge(5, 2);
    G.addEdge(3, 4);
    DFS.DFSearch dfs = new DFS.DFSearch(G, 0);
    dfs.printEdgeTo();
}