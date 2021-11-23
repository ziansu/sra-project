@java.lang.Override
public void onActivityStopped(android.app.Activity activity) {
    currentActivity = null;
    stopMonitoringLightLevels();
}