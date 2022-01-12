@java.lang.Override
public void onLocationChange() {
    android.util.Log.d("cenas", "location changed");
    int currentSteps = stepCounter.getSteps();
    int diff = currentSteps - (lastStepsSinceGPSLocation);
    double distance = gpsDetector.getTraveledDistance();
    lastStepsSinceGPSLocation = currentSteps;
    stepLength = distance / currentSteps;
    android.util.Log.d("cenas", ("" + distance));
    android.util.Log.d("cenas", ("" + currentSteps));
    gpsDetector.resetLocation();
}