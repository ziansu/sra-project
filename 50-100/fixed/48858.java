public static void recursiveDFS(int[][] G, int[] visited, int node) {
    java.lang.System.out.println((node + " "));
    visited[node] = 1;
    for (int i = 0; i < (G.length); i++) {
        if (((G[node][i]) == 1) && ((visited[i]) != 1))
            DFS.recursiveDFS(G, visited, i);
        
    }
}