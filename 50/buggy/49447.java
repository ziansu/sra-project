public void moveDown() {
    org.fisked.renderingengine.service.models.Point point = getAbsolutePoint();
    org.fisked.renderingengine.service.models.Point newPoint = new org.fisked.renderingengine.service.models.Point(((point.getY()) + 1), getLastColumn());
    setAbsolutePoint(newPoint, false);
}