@java.lang.Override
public void onActivityStopped(android.app.Activity activity) {
    if (activity == (currentActivity)) {
        currentActivity = null;
        stopMonitoringLightLevels();
    }
}