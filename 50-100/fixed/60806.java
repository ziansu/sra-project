@java.lang.Override
public void run() {
    try {
        LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, listener);
    } catch (java.lang.SecurityException e) {
        e.printStackTrace();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        if (!(isGoogleApiClientConnected())) {
            mGoogleApiClient.connect();
        }
        registerRequestUpdate(listener, interval);
    }
}