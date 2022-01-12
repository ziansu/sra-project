public float calculateHCost(com.astar.PathNode curNode, com.astar.PathNode endingNode) {
    int dx = java.lang.Math.abs(((endingNode.getX()) - (curNode.getX())));
    int dy = java.lang.Math.abs(((endingNode.getY()) - (curNode.getY())));
    return ((float) (dx)) + dy;
}