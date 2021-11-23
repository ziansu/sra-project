@java.lang.Override
public void onCreate() {
    android.util.Log.e(com.gerus.pulpomatic.services.LocationService.TAG, ("onCreate " + (com.gerus.pulpomatic.services.LocationService.isActiveAlive)));
    com.gerus.pulpomatic.services.LocationService.isActiveAlive = false;
    init();
}