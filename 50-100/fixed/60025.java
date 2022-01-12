@java.lang.Override
public void onLocationChange() {
    android.util.Log.d("cenas", "location changed");
    int currentSteps = stepCounter.getSteps();
    int diff = currentSteps - (lastStepsSinceGPSLocation);
    double distance = gpsDetector.getTraveledDistance();
    if (distance != (-1)) {
        stepLength = distance / currentSteps;
        gpsDetector.resetLocation();
    }
    lastStepsSinceGPSLocation = currentSteps;
    android.util.Log.d("cenas", ("" + distance));
    android.util.Log.d("cenas", ("" + currentSteps));
}