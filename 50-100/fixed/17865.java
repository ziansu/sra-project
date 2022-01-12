@java.lang.Override
public void onStatusChanged(java.lang.String provider, int status, android.os.Bundle extras) {
    if (Logger.DEBUG) {
        final java.lang.String statusString;
        switch (status) {
            case android.location.LocationProvider.OUT_OF_SERVICE :
                statusString = "out of service";
                break;
            case android.location.LocationProvider.TEMPORARILY_UNAVAILABLE :
                statusString = "temporarily unavailable";
                break;
            case android.location.LocationProvider.AVAILABLE :
                statusString = "available";
                break;
            default :
                statusString = "unknown";
                break;
        }
        if (Logger.DEBUG) {
            android.util.Log.d(net.fabiszewski.ulogger.LoggerService.TAG, (((("[location status for " + provider) + " changed: ") + statusString) + "]"));
        }
    }
}