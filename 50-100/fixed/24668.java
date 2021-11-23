@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mSensorManager = ((android.hardware.SensorManager) (getSystemService(Context.SENSOR_SERVICE)));
    sound = new com.GhostlyRunes.SoundHandler(getApplicationContext());
    vib = ((android.os.Vibrator) (getSystemService(getApplicationContext().VIBRATOR_SERVICE)));
    touch = new com.GhostlyRunes.TouchHandler(this, TOUCHID);
}