private synchronized void calculateCoordinates() {
    calculateLocalCoordinates();
    convertCoordinatesToMeters();
    if (interpolationMode)
        zoomCoordinatesIfFar();
    
}