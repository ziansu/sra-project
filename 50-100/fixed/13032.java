public java.util.PriorityQueue<java.lang.Integer> getStartingNodes() {
    sorted = poag.getNodeIDs();
    java.util.PriorityQueue<java.lang.Integer> startingNodeIds = new java.util.PriorityQueue<>();
    for (int i = 0; i < (size); i++) {
        java.lang.Integer[] prevs = poag.getPreviousNodeIDs(sorted[i]);
        if (prevs == null) {
            startingNodeIds.add(sorted[i]);
        }
    }
    return startingNodeIds;
}