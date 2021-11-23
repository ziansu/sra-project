public void sendSensorData(final long timestamp, final float value) {
    android.util.Log.i(edu.ucla.nesl.android.hrmonitor.DataMapClient.TAG, "In sendSensorData");
    executorService.submit(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            sendSensorDataInBackground(timestamp, value);
        }
    });
}