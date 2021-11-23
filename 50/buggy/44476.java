@java.lang.Override
public void onResume() {
    super.onResume();
    if (myGoogleClient.isConnected()) {
        startLocationUpdates();
    }else {
        myGoogleClient.connect();
    }
}