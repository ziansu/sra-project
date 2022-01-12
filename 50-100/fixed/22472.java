public static double getPixels(java.util.List<pathfinding.MapNode> myPath) {
    int totalDistance = 0;
    for (int i = 0; i < ((myPath.size()) - 1); i++) {
        totalDistance += myPath.get(i).distanceTo(myPath.get((i + 1)));
    }
    return totalDistance;
}