@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    stepsSinceLastReboot = java.lang.String.valueOf(event.values[0]);
    com.example.android.msc_project.StepCounter.sendInfo(stepsSinceLastReboot);
}