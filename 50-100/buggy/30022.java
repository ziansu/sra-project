@java.lang.Override
public void onCreate() {
    android.os.Debug.waitForDebugger();
    super.onCreate();
    timber.log.Timber.d("onCreate() entered!!!111oneoneone");
    android.util.Log.d("TAG", "onCreate() entered!!!111oneoneone");
    if ((sensorReader) == null)
        sensorReader = new com.polsl.roadtracker.SensorReader(((android.hardware.SensorManager) (getSystemService(com.polsl.roadtracker.SENSOR_SERVICE))));
    
    injectDependencies();
    buildGoogleApiClient();
    createLocationRequest();
    createBuilder();
    mGoogleApiClient.connect();
    android.os.Debug.waitForDebugger();
}