private void drawMarkers() {
    for (final gov.nasa.worldwind.geom.Position pos : this.mousePositionOnMap) {
        final gov.nasa.worldwind.render.PointPlacemark pointPlacemarkOnMapList = new gov.nasa.worldwind.render.PointPlacemark(pos);
        this.layer.addRenderable(pointPlacemarkOnMapList);
    }
}