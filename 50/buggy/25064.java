private void updateWithNewCoordinates(double latitude, double longitude, double altitude, float accuracy) {
    geoInputContainer.displayCoordinates((latitude + ""), (longitude + ""), altitude, accuracy);
    updateCode(latitude, longitude);
}