private common.UndirectedGraphNode cloneGraph(common.UndirectedGraphNode node, java.util.HashMap<common.UndirectedGraphNode, common.UndirectedGraphNode> nodes) {
    common.UndirectedGraphNode newNode = new common.UndirectedGraphNode(node.label);
    nodes.put(node, newNode);
    for (common.UndirectedGraphNode neighbor : node.neighbors) {
        common.UndirectedGraphNode newNeighbor = nodes.get(neighbor);
        if (newNeighbor == null) {
            newNeighbor = cloneGraph(neighbor, nodes);
        }
        newNode.neighbors.add(newNeighbor);
    }
    return node;
}