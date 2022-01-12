private boolean onMeasurementRSSIsFilled() {
    if ((measurementRSSIs.size()) < (Setup.MEASUREMENT_AMT_THRESHOLD)) {
        measurementRSSIs.add(rssi);
        return false;
    }
    measurementStarted = false;
    return true;
}