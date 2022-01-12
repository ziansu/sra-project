@java.lang.Override
public void onCreate() {
    super.onCreate();
    if ((sensorReader) == null)
        sensorReader = new com.polsl.roadtracker.SensorReader(((android.hardware.SensorManager) (getSystemService(com.polsl.roadtracker.SENSOR_SERVICE))));
    
    injectDependencies();
    buildGoogleApiClient();
    createLocationRequest();
    createBuilder();
    mGoogleApiClient.connect();
}