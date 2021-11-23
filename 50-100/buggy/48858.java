public static void recursiveDFS(int[][] G, boolean[] visited, int node) {
    java.lang.System.out.println((node + " "));
    visited[node] = true;
    for (int i = 0; i < (G.length); i++) {
        if (((G[node][i]) == 1) && (!(visited[i])))
            DFS.recursiveDFS(G, visited, i);
        
    }
}