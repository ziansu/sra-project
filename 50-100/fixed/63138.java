@java.lang.Override
public java.util.List<com.github.rinde.rinsim.geom.Point> getShortestPathTo(com.github.rinde.rinsim.geom.Point from, com.github.rinde.rinsim.geom.Point to) {
    com.google.common.base.Preconditions.checkArgument(isPointInBoundary(from), ("from must be within the predefined boundary of the plane, from is %s, " + "boundary: min %s, max %s."), from, min, max);
    com.google.common.base.Preconditions.checkArgument(isPointInBoundary(to), ("to must be within the predefined boundary of the plane, to is %s," + " boundary: min %s, max %s."), to, min, max);
    return java.util.Arrays.asList(from, to);
}