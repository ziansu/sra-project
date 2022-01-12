@java.lang.Override
public void onConnectionSuspended(int i) {
    LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
    mBuilder.setContentTitle("Connection suspended");
    mBuilder.setContentText("Reconnecting...");
    startForeground(Constants.FOREGROUND_SERVICE, mBuilder.build());
    try {
        java.lang.Thread.sleep(5000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    mGoogleApiClient.connect();
}