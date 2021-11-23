public static boolean isSupportStepCounter(android.content.Context context) {
    if ((android.os.Build.VERSION.SDK_INT) < (android.os.Build.VERSION_CODES.KITKAT)) {
        return false;
    }
    if (!(context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_SENSOR_STEP_COUNTER))) {
        return false;
    }
    android.hardware.SensorManager sensorManager = ((android.hardware.SensorManager) (context.getSystemService(Context.SENSOR_SERVICE)));
    android.hardware.Sensor stepCounterSensor = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
    return stepCounterSensor != null;
}