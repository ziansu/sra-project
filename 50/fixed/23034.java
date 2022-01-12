private synchronized void calculateCoordinates() {
    convertCoordinatesToMeters();
    if (interpolationMode)
        zoomCoordinatesIfFar();
    
}