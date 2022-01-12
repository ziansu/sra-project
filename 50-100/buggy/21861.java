public static void DFS(int[][] G) {
    boolean[] visited = new boolean[G.length];
    for (int i = 0; i < (G.length); i++) {
        visited[i] = true;
    }
    DFS.recursiveDFS(G, visited, 0);
}