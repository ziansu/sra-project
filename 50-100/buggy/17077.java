private void startSensors() {
    if (nl.mranderson.sittingapp.Utils.isPlayServiceAvailable(this)) {
        mGApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addApi(ActivityRecognition.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
        mGApiClient.connect();
    }else {
        android.app.Dialog errorDialogPlayService = nl.mranderson.sittingapp.Utils.getErrorDialogPlayService(this);
        if (errorDialogPlayService != null)
            errorDialogPlayService.show();
        
    }
}