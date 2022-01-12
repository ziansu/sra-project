private java.util.List<java.util.List<java.lang.Integer>> dfs(java.lang.Integer node) {
    java.util.List<java.util.List<java.lang.Integer>> pathList = new java.util.ArrayList<>();
    java.util.List<java.lang.Integer> path = new java.util.ArrayList<>();
    path.add(node);
    for (java.lang.Integer succ : currGraph[node]) {
        java.util.List<java.lang.Integer> pathCopy = new java.util.ArrayList<>();
        pathCopy.addAll(path);
        dfsHelper(succ, pathCopy, pathList);
    }
    return pathList;
}