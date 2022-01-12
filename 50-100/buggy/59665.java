@java.lang.Override
public boolean equals(final java.lang.Object object) {
    if ((object == null) || ((object.getClass()) != (com.rgi.common.coordinates.AbsoluteTileCoordinate.class))) {
        return false;
    }
    final com.rgi.common.coordinates.AbsoluteTileCoordinate other = ((com.rgi.common.coordinates.AbsoluteTileCoordinate) (object));
    return ((super.equals(other)) && ((this.zoomLevel) == (other.zoomLevel))) && ((this.origin) == (other.origin));
}