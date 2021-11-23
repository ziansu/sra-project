@java.lang.Override
public void onDestroy() {
    if ((rawDataLog) != null) {
        try {
            rawDataLog.flush();
            rawDataLog.close();
            rawDataLog = null;
        } catch (java.io.IOException e) {
            android.util.Log.e(com.freedie.sensordemo.SensorRecorder.TAG, "IO Exception when trying to close inertial data log files");
        }
    }
    if ((sensorManager) != null) {
        sensorManager.unregisterListener(sensorEventListener);
    }
    super.onDestroy();
}