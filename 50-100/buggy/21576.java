public int findFriendsCircle(int[][] M) {
    boolean[] visited = new boolean[M.length];
    int friendsCircleCount = 0;
    for (int u = 0; u < (M.length); u++) {
        if (!(visited[u])) {
            dfs(M, visited, u);
        }
    }
}