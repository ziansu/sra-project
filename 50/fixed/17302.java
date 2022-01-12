private void swap() {
    java.util.Collections.swap(measurementLayer.getMeasurementPoints(), from, to);
    measurementLayer.refreshMap();
}