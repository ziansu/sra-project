public java.util.Set<? extends com.cfar.swim.worldwind.geom.RegularGrid> getNeighbors() {
    java.util.Set<com.cfar.swim.worldwind.geom.RegularGrid> neighbors = new java.util.HashSet<com.cfar.swim.worldwind.geom.RegularGrid>(26);
    if (this.hasParent()) {
        gov.nasa.worldwind.geom.Vec4[] corners = this.getCorners();
        for (gov.nasa.worldwind.geom.Vec4 corner : corners) {
            neighbors.addAll(this.parent.lookupCells(corner));
        }
        neighbors.remove(this);
    }
    return neighbors;
}