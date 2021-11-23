public void stopRequestLocation() {
    if ((mGoogleApiClient) != null) {
        LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
        mGoogleApiClient.disconnect();
    }
    if ((routine_check_connection) != null) {
        routine_check_connection.stopUpdates();
        hyjjr.cs160.com.safe_radius.MainActivity.routineRunned = false;
    }
    if ((routine_check_history) != null) {
        routine_check_history.stopUpdates();
    }
}