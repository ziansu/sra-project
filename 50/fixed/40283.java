private com.github.nisrulz.sensey.ProximityDetector startProximityDetection(com.github.nisrulz.sensey.ProximityDetector.ProximityListener listener) {
    sensey.startProximityDetection(listener);
    return getDetector(listener, com.github.nisrulz.sensey.ProximityDetector.class);
}