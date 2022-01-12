public static java.util.List<pi.pathfinder.Area> createGraphFromMap(pi.controller.Map map, int robotWidth, int robotHeight) {
    java.util.List<pi.pathfinder.ObstacleEdge> obstacleEdges = pi.pathfinder.GraphConverter.createObstacleEdges(map.getObstacles());
    pi.pathfinder.GraphConverter.sortObstacleEdges(obstacleEdges);
    java.util.List<pi.pathfinder.Area> graph = pi.pathfinder.GraphConverter.createGraphFromObstacleEdges(map, obstacleEdges);
    pi.pathfinder.GraphConverter.removeTooSmallAreas(graph, robotWidth, robotHeight);
    pi.pathfinder.GraphConverter.logger.info(map.getObstacles());
    pi.pathfinder.GraphConverter.logger.info(graph);
    return graph;
}