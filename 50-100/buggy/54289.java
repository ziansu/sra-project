private int GetLengthHelper(int currentNode, int currentDepth) {
    int maxDepth = -1;
    java.util.ArrayList<java.lang.Integer> backwardEdges = null;
    if (!(transposeEdgeMap.containsKey(currentNode))) {
        backwardEdges = transposeEdgeMap.get(currentNode);
        return currentDepth;
    }
    for (int edge : backwardEdges) {
        int tempDepth = GetLengthHelper(edge, (currentDepth + 1));
        if (maxDepth < tempDepth)
            maxDepth = tempDepth;
        
    }
    return maxDepth;
}