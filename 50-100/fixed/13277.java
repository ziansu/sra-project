public static void dfs(Graph g, java.lang.String vertex) {
    if (((Main.visited.get(vertex)) == null) || (!(Main.visited.get(vertex)))) {
        Main.visited.put(vertex, java.lang.Boolean.TRUE);
        for (java.lang.String neighbor : g.getNeighbors(vertex)) {
            Main.dfs(g, neighbor);
        }
        Main.alphabet[Main.counter] = vertex;
        (Main.counter)--;
    }
}