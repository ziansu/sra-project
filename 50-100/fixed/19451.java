private java.util.Queue<net.frozenbit.strategicelements.GridPosition.Direction> constructPath(java.util.Map<net.frozenbit.strategicelements.GridPosition, net.frozenbit.strategicelements.GridPosition.Direction> pathParent, net.frozenbit.strategicelements.GridPosition goalNode) {
    java.util.Deque<net.frozenbit.strategicelements.GridPosition.Direction> path = new java.util.ArrayDeque<>();
    while (pathParent.containsKey(goalNode)) {
        net.frozenbit.strategicelements.GridPosition.Direction direction = pathParent.get(goalNode);
        goalNode = goalNode.getNeighbor(direction);
        path.addFirst(direction);
    } 
    return path;
}