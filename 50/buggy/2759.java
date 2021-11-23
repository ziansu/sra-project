public boolean isZoomedOutCompletely() {
    return (java.lang.Math.abs(((zoomLevel) - (minZoomLevel)))) < 0.001;
}