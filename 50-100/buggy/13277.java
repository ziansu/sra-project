public static void dfs(Graph g, java.lang.String vertex) {
    for (java.lang.String neighbor : g.getNeighbors(vertex)) {
        Main.visited.put(neighbor, java.lang.Boolean.TRUE);
        Main.dfs(g, neighbor);
    }
    Main.alphabet[Main.counter] = vertex;
    (Main.counter)--;
}