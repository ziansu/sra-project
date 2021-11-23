public void initialize(double startX, double startY) {
    if ((amountOfPoints) != (-1)) {
        angleInside = piekie.sensors.util.MathUtils.getAngleInPolygon(amountOfPoints);
    }
}