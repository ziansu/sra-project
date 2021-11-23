public static void DFS(int[][] G) {
    int[] visited = new int[G.length];
    for (int i = 0; i < (G.length); i++) {
        visited[i] = 0;
    }
    DFS.recursiveDFS(G, visited, 0);
}