public int detNodesSpannedByAnnotation(int startLoopIdx, java.util.HashMap<java.lang.Integer, core.Node> nodeMap) {
    int startNodeId = findFirstSpannedNode(nodeMap, startLoopIdx, this.start);
    int endNodeId = findLastSpannedNode(nodeMap, startNodeId, this.end);
    for (int idx = startNodeId; idx <= endNodeId; idx++) {
        core.Node n = nodeMap.get(idx);
        if (n == null)
            continue;
        
        addSpannedNode(n);
    }
    java.lang.System.out.println(((startNodeId + " : ") + endNodeId));
    return endNodeId;
}