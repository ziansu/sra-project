@java.lang.Override
public java.util.Set<gov.nasa.worldwind.geom.Position> getNeighbors(gov.nasa.worldwind.geom.Position position) {
    java.util.Set<gov.nasa.worldwind.geom.Position> neighbors = new java.util.HashSet<gov.nasa.worldwind.geom.Position>(6);
    if (null != (this.globe)) {
        java.util.Set<gov.nasa.worldwind.geom.Vec4> neighborPoints = this.getNeighbors(this.globe.computePointFromPosition(position));
        for (gov.nasa.worldwind.geom.Vec4 neighbor : neighborPoints) {
            neighbors.add(this.globe.computePositionFromPoint(neighbor));
        }
    }
    return neighbors;
}