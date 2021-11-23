@java.lang.Override
public void onConnectionSuspended(int i) {
    com.andela.motustracker.model.ActivityRecognitionScan.googleApiClient.connect();
}