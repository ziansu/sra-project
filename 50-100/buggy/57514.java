public void moveNode() {
    com.mapbox.mapboxsdk.geometry.LatLng center = mapView.getCenter();
    com.spatialdev.osm.model.OSMNode selectedNode = ((com.spatialdev.osm.model.OSMNode) (com.spatialdev.osm.model.OSMElement.getSelectedElements().getFirst()));
    selectedNode.move(jtsModel, center);
    mapView.invalidate();
}