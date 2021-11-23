private void unifyResolution(java.awt.Point point) {
    point.x = ((point.x) * (screenCameraRatio.x)) - ((screenCoordinates.x) / 2);
    point.y = ((point.y) * (screenCameraRatio.y)) - ((screenCoordinates.y) / 2);
}