private void drawPolyLines() {
    if ((this.mousePositionOnMap.size()) > 1) {
        final gov.nasa.worldwind.render.Polyline polyline = new gov.nasa.worldwind.render.Polyline(this.mousePositionOnMap);
        polyline.setColor(java.awt.Color.RED);
        polyline.setLineWidth(2);
        layer.addRenderable(polyline);
    }
}