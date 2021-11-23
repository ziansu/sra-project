private void swap() {
    try {
        java.util.Collections.swap(measurementLayer.getMeasurementPoints(), from, to);
    } catch (java.lang.Exception e) {
    }
    measurementLayer.refreshMap();
}