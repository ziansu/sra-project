public utility.UndirectedGraphNode cloneGraph(utility.UndirectedGraphNode node) {
    if (node == null) {
        return null;
    }
    return cloneGraphRecurse(node, new java.util.HashMap<java.lang.Integer, utility.UndirectedGraphNode>());
}