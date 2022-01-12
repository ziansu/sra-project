private static com.astar.PathNode lowestFCostOpenNode(java.util.LinkedList<com.astar.PathNode> openList) {
    com.astar.PathNode returnNode = null;
    for (com.astar.PathNode curNode : openList) {
        if ((returnNode == null) || ((((curNode.getFCost()) != null) && ((returnNode.getFCost()) != null)) && ((curNode.getFCost()) < (returnNode.getFCost())))) {
            returnNode = curNode;
        }
    }
    return returnNode;
}