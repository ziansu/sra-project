private java.util.LinkedList<java.lang.Integer> Dfs(int startNode, int endNode) {
    java.util.HashMap<java.lang.Integer, java.lang.Boolean> visited = new java.util.HashMap<java.lang.Integer, java.lang.Boolean>(nodes.size());
    java.util.LinkedList<java.lang.Integer> longestPath = new java.util.LinkedList<java.lang.Integer>();
    return DFShelper(startNode, endNode, visited, longestPath);
}