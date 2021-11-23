@java.lang.SuppressWarnings(value = "unchecked")
public java.util.Set<? extends com.cfar.swim.worldwind.planning.NonUniformCostIntervalGrid> lookupCells(gov.nasa.worldwind.geom.Position position) {
    java.util.Set<com.cfar.swim.worldwind.planning.NonUniformCostIntervalGrid> cells = null;
    if (null != (this.globe)) {
        cells = ((java.util.Set<com.cfar.swim.worldwind.planning.NonUniformCostIntervalGrid>) (super.lookupCells(this.globe.computePointFromPosition(position))));
    }
    return cells;
}