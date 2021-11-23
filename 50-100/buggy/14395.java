public static pathfinding.Vec2D getNextTarget(pathfinding.Vec2D pos, pathfinding.Vec2D targetPos) {
    pathfinding.Graph graph = main.Main.getGraph();
    int start = environment.World.quantize(pos);
    int end = environment.World.quantize(targetPos);
    if (start == end)
        return targetPos;
    
    java.util.List<java.lang.Integer> path = pathfinding.PathFinding.AStar(graph, start, end);
    return graph.getNodePos(path.get(0));
}