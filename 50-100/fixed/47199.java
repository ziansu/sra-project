@java.lang.Override
public com.week3.solution.geo.Geometry encapsulate(final com.week3.solution.geo.Geometry paramGeometry) {
    if ((this.dimensions()) != (paramGeometry.dimensions())) {
        return null;
    }
    if (paramGeometry instanceof com.week3.solution.geo.Point) {
        final com.week3.solution.geo.Point point = ((com.week3.solution.geo.Point) (paramGeometry));
        return new com.week3.solution.geo.Volume(this, point);
    }else {
        return paramGeometry.encapsulate(new com.week3.solution.geo.Volume(this, this));
    }
}