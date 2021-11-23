private com.github.nisrulz.sensey.ProximityDetector startProximityDetection() {
    com.github.nisrulz.sensey.ProximityDetector.ProximityListener fakeListener = org.mockito.Mockito.mock(com.github.nisrulz.sensey.ProximityDetector.ProximityListener.class);
    sensey.startProximityDetection(fakeListener);
    return getDetector(com.github.nisrulz.sensey.ProximityDetector.class);
}