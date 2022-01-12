private double distanceTo(pathfinding.MapNode n) {
    double xDelta = (this.location.getX()) - (n.location.getX());
    double yDelta = (this.location.getY()) - (n.location.getY());
    return java.lang.Math.sqrt(((java.lang.Math.pow(xDelta, 2)) + (java.lang.Math.pow(yDelta, 2))));
}