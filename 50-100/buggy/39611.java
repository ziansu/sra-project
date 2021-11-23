private boolean dfs(int vFrom) {
    for (int vToIndex = 0; vToIndex < (size[vFrom]); ++vToIndex) {
        final int vTo = graph[vFrom][vToIndex];
        if (visted[vTo]) {
            return true;
        }
        visted[vFrom] = true;
        if (dfs(vTo)) {
            return true;
        }
        visted[vFrom] = false;
    }
    return false;
}