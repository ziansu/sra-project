private boolean dfs(int vFrom) {
    for (int vTo = 0; vTo < (vertexCount); ++vTo) {
        if (graph[vFrom][vTo]) {
            if (visted[vTo]) {
                return true;
            }
            visted[vFrom] = true;
            if (dfs(vTo)) {
                return true;
            }
            visted[vFrom] = false;
        }
    }
    return false;
}