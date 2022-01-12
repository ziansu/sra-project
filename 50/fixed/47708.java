public void initialize() {
    if ((amountOfPoints) != (-1)) {
        angleInside = piekie.sensors.util.MathUtils.getAngleInPolygon(amountOfPoints);
    }
}