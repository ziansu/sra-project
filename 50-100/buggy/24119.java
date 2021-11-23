public void enableSensors() {
    ((android.widget.TextView) (mActivity.findViewById(R.id.sensors_status))).setText("");
    for (android.app.PendingIntent sensorLauncher : mSensorsLauncher) {
        mAlarmManager.setInexactRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, 0, ((java.lang.Integer.parseInt(android.preference.PreferenceManager.getDefaultSharedPreferences(mActivity).getString(PreferenceKey.PREF_SENSOR_RATE.toString(), "60"))) * 1000), sensorLauncher);
    }
}