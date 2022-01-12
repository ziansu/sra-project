public static java.util.List<main.pi.pathfinder.Area> createGraphFromMap(main.pi.controller.Map map, int robotWidth, int robotHeight) {
    java.util.List<main.pi.pathfinder.ObstacleEdge> obstacleEdges = main.pi.pathfinder.GraphConverter.createObstacleEdges(map.getObstacles());
    main.pi.pathfinder.GraphConverter.sortObstacleEdges(obstacleEdges);
    java.util.List<main.pi.pathfinder.Area> graph = main.pi.pathfinder.GraphConverter.createGraphFromObstacleEdges(map, obstacleEdges);
    main.pi.pathfinder.GraphConverter.removeTooSmallAreas(graph, robotWidth, robotHeight);
    return graph;
}