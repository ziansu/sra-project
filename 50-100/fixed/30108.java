private void disableSensors() {
    ((android.widget.TextView) (mActivity.findViewById(R.id.sensors_status))).setText(R.string.sensors_disabled);
    ((android.widget.TextView) (mActivity.findViewById(R.id.server_display_status))).setText(R.string.connection_no_data);
    ((tcslab.syndesiapp.views.MainActivity) (mActivity)).removeSensors();
    for (android.app.PendingIntent sensorLauncher : mSensorsLauncher) {
        mAlarmManager.cancel(sensorLauncher);
    }
}