private void startSensors() {
    if (nl.mranderson.sittingapp.Utils.isPlayServiceAvailable(this)) {
        mGApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addApi(ActivityRecognition.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
        mGApiClient.connect();
    }
}