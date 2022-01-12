protected void stopLocationUpdates() {
    if ((runningRecord.getRunningPath().size()) > 0) {
        this.sendData();
    }
    if ((mGoogleApiClient) != null) {
        LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
    }
}