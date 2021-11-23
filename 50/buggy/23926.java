private synchronized de.blau.android.osm.Node getClickedNodeOrCreatedWayNode(final float x, final float y) throws de.blau.android.exception.OsmIllegalOperationException {
    return getClickedNodeOrCreatedWayNode(null, x, y);
}