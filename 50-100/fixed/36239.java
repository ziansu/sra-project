private void unifyResolution(java.awt.Point point) {
    point.x = ((point.x) * (screenCameraRatio.x)) - ((screenCoordinates.x) / 2);
    point.y = ((screenCoordinates.y) / 2) - ((point.y) * (screenCameraRatio.y));
}