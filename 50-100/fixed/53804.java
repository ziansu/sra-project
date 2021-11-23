private boolean dfs(int vFrom) {
    visted[vFrom] = true;
    for (int vTo = 0; vTo < (vertexCount); ++vTo) {
        if (graph[vFrom][vTo]) {
            if (visted[vTo]) {
                return true;
            }
            if (dfs(vTo)) {
                return true;
            }
        }
    }
    visted[vFrom] = false;
    return false;
}