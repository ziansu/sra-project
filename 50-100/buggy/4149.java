@java.lang.Override
public void onSensorValueChanged(final com.samsung.android.sdk.remotesensor.SrsRemoteSensorEvent srsRemoteSensorEvent) {
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if ((srsRemoteSensorEvent.sensor.getType()) == (com.samsung.android.sdk.remotesensor.SrsRemoteSensor.TYPE_PEDOMETER)) {
                appsandmaps.temple.edu.content_provider.MainActivity.Steps = java.lang.Float.toString(srsRemoteSensorEvent.values[0]);
                updateInformation("1");
                textViews = ((android.widget.TextView) (findViewById(R.id.textView8)));
                textViews.setText(appsandmaps.temple.edu.content_provider.MainActivity.Steps);
            }
        }
    });
}