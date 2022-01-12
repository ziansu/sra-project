@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
    if (android.preference.PreferenceManager.getDefaultSharedPreferences(mAppContext).getBoolean(PreferenceKey.PREF_SENSOR_PERM.toString(), false)) {
        android.os.AsyncTask sendData = new tcslab.syndesiapp.controllers.network.SendDataTask(mAppContext);
        sendData.execute(new android.hardware.SensorEvent[]{ sensorEvent });
    }
    mSensorManager.unregisterListener(this);
    this.mWakeLock.release();
}