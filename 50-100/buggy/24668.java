@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mSensorManager = ((android.hardware.SensorManager) (getSystemService(Context.SENSOR_SERVICE)));
    sound = new com.GhostlyRunes.SoundHandler(getApplicationContext());
    tada = sound.load(R.raw.tada);
    blow = sound.load(R.raw.blow);
    vib = ((android.os.Vibrator) (getSystemService(getApplicationContext().VIBRATOR_SERVICE)));
    touch = new com.GhostlyRunes.TouchHandler(this, TOUCHID);
}