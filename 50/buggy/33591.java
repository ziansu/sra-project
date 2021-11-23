private void drawMarkers() {
    java.lang.System.out.println(mousePositionOnMap.size());
    for (final gov.nasa.worldwind.geom.Position pos : this.mousePositionOnMap) {
        final gov.nasa.worldwind.render.PointPlacemark pointPlacemarkOnMapList = new gov.nasa.worldwind.render.PointPlacemark(pos);
        layer.addRenderable(pointPlacemarkOnMapList);
    }
}