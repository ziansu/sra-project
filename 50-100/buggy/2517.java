public void findPath() {
    java.lang.System.out.println("find path");
    java.awt.Point current = start;
    java.util.ArrayList<pathfinding.Way> possibleDirections = getAllpossibleDirections(current, Way.LEFT);
    for (pathfinding.Way direction : possibleDirections) {
        goTo(current, direction, new java.util.ArrayList<pathfinding.Way>());
    }
    java.lang.System.out.println(allPaths.size());
    for (java.util.ArrayList<pathfinding.Way> path : allPaths) {
        java.lang.System.out.print(path);
    }
}