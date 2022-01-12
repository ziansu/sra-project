private boolean inRange(org.joml.Vector2i start, org.joml.Vector2i goal, java.util.Set<org.joml.Vector2i> walls) {
    final double viewRange = 5;
    if ((start.distance(goal)) < viewRange) {
        java.util.Set<org.joml.Vector2i> viewTiles = getTilesOnLine(start, goal);
        for (org.joml.Vector2i tile : viewTiles) {
            if (walls.contains(tile)) {
                return false;
            }
        }
    }
    return true;
}