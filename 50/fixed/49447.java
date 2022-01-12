public void moveDown() {
    org.fisked.renderingengine.service.models.Point point = getAbsolutePoint();
    org.fisked.renderingengine.service.models.Point newPoint = new org.fisked.renderingengine.service.models.Point(getLastColumn(), ((point.getY()) + 1));
    setAbsolutePoint(newPoint, false);
}